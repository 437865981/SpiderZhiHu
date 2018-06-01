package com.fx.spider;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <dl>
 * <dt>ZhiHuThread</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/18</dd>
 * </dl>
 *
 * @author ${纔訾}
 */
public class ZhiHuThread implements Runnable {

    /**
     * 保存关注的人
     */
    private static Map<String, List> map = new HashMap<>();
    private int urlExceptionIndex = 0;
    static java.sql.Connection connection1 = new ConnUtil().getConn();
    private String[] urlException = {
            "https://www.zhihu.com/people/wo-ben-chun-ji-85/followers",
            "https://www.zhihu.com/people/chu-yun-qing-83/followers",
            "https://www.zhihu.com/people/new-soul-39-74/followers",
            "https://www.zhihu.com/people/zhang-yu-meng-7/followers",
            "https://www.zhihu.com/people/rainmaker-49/followers",
            "https://www.zhihu.com/people/nianxiaxia/followers",
            "https://www.zhihu.com/people/Orzhui/followers",

    };

    @Override
    public void run() {
        try {
            getResource(Thread.currentThread().getName());
        } catch (Exception e) {
            try {
                synchronized (this) {
                    getResource(urlException[urlExceptionIndex++]);
                }
            } catch (Exception e1) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        try {
            getResource("https://www.zhihu.com/people/wo-ben-chun-ji-85/followers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getResource(String url) throws Exception {
        System.out.println(url);
        Connection connection = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .timeout(3000000)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0");
        Document html = connection.get();

        //获取原始的urlToken
        String oldUrlToken = url.substring(url.lastIndexOf("/", url.lastIndexOf("/") - 1) + 1, url.lastIndexOf("/"));
        // detail_url = each('a').attr.href
        //Arr = json.loads(each.attr["data-state"])
        /**
         return{
         "array":Arr,
         "json":ArrJson
         }
         *
         */
        //获取关注的人
        org.jsoup.nodes.Element element = html.getElementById("data");
        String path = element.attr("data-state");
        JSONObject jsonObject = JSON.parseObject(path);
        JSONObject userJsonObject = jsonObject.getJSONObject("entities").getJSONObject("users");
        System.out.println(userJsonObject);
        //存放已存在的List
        Set<Map.Entry<String, Object>> entries = userJsonObject.entrySet();
        List<ZhiHuUser> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : entries
                ) {
            ZhiHuUser user = JSON.parseObject(entry.getValue().toString(), ZhiHuUser.class);
            System.out.println(user.toString());
            list.add(user);
        }
        //关注对应map
        map.put(oldUrlToken, list);


    }/* for (Map.Entry<String,Object> entry: entries
                    ) {
                ZhiHuUserSimple user = JSON.parseObject(entry.getValue().toString(),ZhiHuUserSimple.class);
                String urlChild = "https://www.zhihu.com/people/urlToken/followers";
                String urlChild2 = "https://www.zhihu.com/people/urlToken/following";
                String myUrl = urlChild.replace("urlToken",user.getUrlToken());
                String myUrl2 = urlChild2.replace("urlToken",user.getUrlToken());
                //没关注的人或者到了自�?
                if( (entries.size()==1) || entry.getKey().equals(oldUrlToken)){
                    continue;
                }
                //跳过互相关注
                if( map.containsKey(entry.getKey())){
                    continue;
                }
                try {
                    String a =user.getAvatarUrlTemplate();
                    int index = a.indexOf("{");
                    if( index> 0 ){
                        //下载图片
                        downloadImg(a.substring(0,index)+"xll.jpg","D:\\images\\");
                    }
                    //插入某人�?有的关注
                    String sql = "insert into ZhiHuUserSimple values("+"\""+oldUrlToken+"\""+","+user.toString()+")";
                    PreparedStatement preparedStatement = connection1.prepareStatement(sql);
                    preparedStatement.execute();

                    String sql2 = "insert into ZhiHuUserOfMap values(\""+oldUrlToken+"\","+"\""+user.getId()+"\""+")";
                    preparedStatement = connection1.prepareStatement(sql2);
                    preparedStatement.execute();
                    //递归遍历
                    getResource(myUrl);
                    getResource(myUrl2);
                }catch (Exception e){
                    //抛异常，遍历下一�?
                    continue;
                }
*/



    public  void downloadImg(String url,String path) {
        File file = null;
        FileOutputStream fos = null;
        String downloadName = url.substring(url.lastIndexOf("/") + 1);
        HttpURLConnection httpURLConnection = null;
        URL urlObj = null;
        InputStream in = null;
        byte[] size = new byte[1024];
        int num = 0;
        try {
            file = new File(path + downloadName);
            fos = new FileOutputStream(file);
            if (url.startsWith("http")) {
                urlObj = new URL(url);
                httpURLConnection = (HttpURLConnection)urlObj.openConnection();
                in = httpURLConnection.getInputStream();
                while ((num = in.read(size)) != -1) {
                    for (int i = 0; i < num; i++)
                        fos.write(size[i]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                fos.close();
                System.out.println("download finish!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

