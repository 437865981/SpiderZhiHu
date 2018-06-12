package com.fx.SpiderZhiiHu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fx.entity.UserOfZhiHu;
import com.fx.service.UserOfZhiHuService;
import com.fx.service.impl.UserOfZhiHuServiceImpl;
import com.fx.utils.RedisUtil;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.net.ssl.SSLHandshakeException;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/spider")
public class SpiderZhiHuController {

    private static Logger logger = LoggerFactory.getLogger(SpiderZhiHuController.class);

    @Autowired
    private RedisUtil redisUtil;

    private int i = 0;

    private volatile int flag = 1;


    /**
     * 代理服务器地址
     */
    private List proxyList = new ArrayList();

    @Autowired
    private UserOfZhiHuServiceImpl userOfZhiHuService;


    /**
     * 爬取的线程类
     */
    class CrawlThread implements Runnable {

        /**
         * 代理IP类(共享对象)
         */
        private ProxyIp proxyIp;
        int index = 0;
        public CrawlThread(ProxyIp proxyIp) {
            this.proxyIp = proxyIp;
        }

        /**
         * 循环抓取,先判断代理类是否
         */
        @Override
        public void run() {
            String url = Constant.crawlRoot[index++];
            System.out.println("当前url为："+url);
            while (true) {
                    logger.error("当前所用的代理为:"+proxyIp.ip+":"+proxyIp.port+"进入开始爬取starting################################");
                    try {
                        //判断当前url是否爬过
                        while (isVisited(url)) {
                            logger.info("已爬取：" + url);
                            url = getNormalUrl();
                        }
                        logger.info("待爬取：" + url);

                     /*   Connection connection = Jsoup.connect(url)
                                .method(Connection.Method.GET)
                                .timeout(5000)
                                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.84 Safari/537.36")
                                .proxy(proxyIp.ip, proxyIp.port);
                        Document html = connection.get();
*/
                        Document html = Jsoup.connect("https://www.zhihu.com/people/jason5ng32/following")
                                .timeout(2 * 1000)
                                .proxy(proxyIp.ip, proxyIp.port)
                                .get();

                        logger.info("开始爬取第" + (flag++) + "个URL###############################!");

                        //获取当前所爬取的URL的用户UrlToken
                        String oldUrlToken = url.substring(url.lastIndexOf("/", url.lastIndexOf("/") - 1) + 1, url.lastIndexOf("/"));

                        //解析到用户JSON  entities 其中有一个是自己的详细信息，其他时关注者的粗略信息
                        org.jsoup.nodes.Element element = html.getElementById("data");
                        String path = element.attr("data-state");
                        JSONObject jsonObject = JSON.parseObject(path);
                        JSONObject userJsonObject = jsonObject.getJSONObject("entities").getJSONObject("users");
                        UserOfZhiHu zhiHu = JSON.parseObject(userJsonObject.getString(oldUrlToken), UserOfZhiHu.class);

                        if (userJsonObject != null && zhiHu !=null) {
                            //插入本用户

                            userOfZhiHuService.insertSelective(zhiHu);

                            //将其他用户拼接url插入爬取队列中
                            Set<String> keys = userJsonObject.keySet();

                            for (String key : keys) {
                                //关注他的队列
                                addNormalUrl(Constant.follower.replace("urlToken", key));
                                //他关注的队列
                                addNormalUrl(Constant.following.replace("urlToken", key));
                            }

                            //已爬取取入库
                            List list = new ArrayList();
                            list.add(url);
                            redisUtil.listSet(Constant.visitedKey, list);
                        } else {
                            logger.info("被拦截!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        }

                        //递归爬取
                        url = getNormalUrl();

                    } catch (SSLHandshakeException ssl) {
                        //代理出错，需要更换代理
                        System.out.println("代理安全校验失败,重新获取代理ip！");
                        proxyIp = getProxyIp();
                    } catch (SocketTimeoutException socketTimeoutException) {
                        System.out.println("代理连接超时，重新获取代理ip！");
                        proxyIp = getProxyIp();
                    }catch (IOException ioException){
                        System.out.println("代理400，重新获取代理ip！");
                        proxyIp = getProxyIp();
                    }
                    catch (Exception e) {
                        logger.error("异常爬取：" + url);
                        e.printStackTrace();
                        logger.error(e.getMessage());
                        addAbnormalUrl(url);
                        url = getNormalUrl();

                    }
            }
        }
    }

    @RequestMapping(value = "spiderZhiHu")
    public void spiderZhiHu() {
        ExecutorService service = Executors.newCachedThreadPool();
        /**
         * 获取代理IP
         */
        for (int j = 0; j <3 ; j++) {
            service.execute(new crawlProxyIp());
        }
        /**
         * 抓取知乎用户信息
         */
        ProxyIp proxyIp = getProxyIp();
        for (int j = 0; j < 8; j++) {
            service.execute(new CrawlThread(proxyIp));
        }
    }

    public void crawlZhiHu(ProxyIp proxyIp,String url){
        {

        }
    }

    /**
     * 获取代理IP
     */
    class crawlProxyIp implements Runnable {

        @Override
        public void run() {
            String ipReg = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3} \\d{1,6}";
            Pattern ipPtn = Pattern.compile(ipReg);

            String[] baseUrls = {
                    "http://www.xicidaili.com/nn/1",
                    "http://www.xicidaili.com/nt/1",
                    "http://www.xicidaili.com/wt/1",
                    "http://www.kuaidaili.com/free/inha/1",
                    "http://www.kuaidaili.com/free/intr/1",
                    "http://www.kuaidaili.com/free/outtr/1"
            };
            while (true) {
                for (int i = new Random().nextInt(5); i < baseUrls.length; i++) {
                    try {
                        System.out.println("base info:" + baseUrls[i]);
                        Document doc = Jsoup.connect(baseUrls[i])
                                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                                .header("Accept-Encoding", "gzip, deflate, sdch")
                                .header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6")
                                .header("Cache-Control", "max-age=0")
                                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                                .header("Cookie", "Hm_lvt_7ed65b1cc4b810e9fd37959c9bb51b31=1462812244; _gat=1; _ga=GA1.2.1061361785.1462812244")
                                .header("Host", "www.kuaidaili.com")
                                .header("Referer", "http://www.kuaidaili.com/free/outha/")
                                .timeout(4 * 1000)
                                .get();
                        Matcher m = ipPtn.matcher(doc.text());

                        while (m.find()) {
                            String[] strs = m.group().split(" ");
                            if (checkProxy(strs[0], Integer.parseInt(strs[1]))) {

                                //将代理地址放入redis
                                Map<String, Integer> map = new HashMap<>();
                                map.put(strs[0], Integer.parseInt(strs[1]));
                                proxyList.add(map);
                                logger.info("获取到可用代理IP\t" + map);
                                redisUtil.listSet("proxyList", proxyList);
                            }
                        }
                    } catch (Exception e) {
                        logger.error("获取Ip代理出错，代理服务器为：" + baseUrls[i]);
                    }
                }
            }
        }
    }

    /**
     * 检验代理ip是否有效
     *
     * @param ip
     * @param port
     * @return
     */
    private synchronized boolean checkProxy(String ip, Integer port) {
        try {
            logger.info("checkIp:" + ip + ":" + port);
            Document document = Jsoup.connect("https://www.zhihu.com/people/jason5ng32/following")
                    .timeout(3 * 1000)
                    .proxy(ip, port)
                    .get();
            if (document.title().equals("安全验证")){
                return false;
            }else{
                logger.info("#######################抓取到的代理网页title :"+document.title());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 代理实体类
     */
    class ProxyIp {
        private String ip;
        private Integer port;

        ProxyIp(String ip, Integer port) {
            this.ip = ip;
            this.port = port;
        }
    }

    /**
     * 已爬取判断当前访问的url是否已经访问
     *
     * @param url
     * @return
     */
    public synchronized boolean isVisited(String url) {
        List list = redisUtil.listGet(Constant.visitedKey, 0, -1);
        return list.contains(url);
    }

    /**
     * 待爬取的url出栈
     */
    public synchronized String getNormalUrl() {
        return redisUtil.listSetLeftPop(Constant.toVisitKey) == null ? getAbnormalUrl() : (String) redisUtil.listSetLeftPop(Constant.toVisitKey);
    }

    /**
     * 待爬取的url入栈
     *
     * @param url
     */
    public synchronized boolean addNormalUrl(String url) {
        return redisUtil.listSetRightPush(Constant.toVisitKey, url);
    }

    /**
     * 异常的url出栈
     */
    public synchronized String getAbnormalUrl() {
        i = i >= Constant.crawlRoot.length - 1 ? Constant.crawlRoot.length - 1 : i++;
        return redisUtil.listSetLeftPop(Constant.abnormalKey) == null ? Constant.crawlRoot[i] : (String) redisUtil.listSetLeftPop(Constant.toVisitKey);

    }

    /**
     * 异常的url入栈
     *
     * @param url
     */
    public synchronized boolean addAbnormalUrl(String url) {
        return redisUtil.listSetRightPush(Constant.abnormalKey, url);
    }

    /**
     * 从redis中获取代理ip
     * @return
     */
    public synchronized ProxyIp getProxyIp(){
        boolean flag = true;
        Object o = "";
        ProxyIp proxyIp  = null ;
        while (flag){
             o = redisUtil.listSetRightPop("proxyList");
             if (o != null){
                 Map<String,Integer> map = (HashMap)o;
                 logger.info("redis中获取到的proxyMap："+map);
                String ip  =  map.keySet().iterator().next();
                Integer port =  map.values().iterator().next();
                proxyIp = new ProxyIp(ip,port);
             }
             flag = false;
        }
        return proxyIp;
    }
}
