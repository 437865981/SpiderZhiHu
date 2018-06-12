package com.fx.SpiderZhiiHu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fx.entity.UserOfZhiHu;
import com.fx.spider.ZhiHuUser;
import com.fx.utils.RedisUtil;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

import javax.net.ssl.SSLHandshakeException;
import java.io.EOFException;
import java.net.SocketTimeoutException;
import java.util.*;


public class SpiderThread implements Runnable{

    @Autowired
    private RedisUtil redisUtil;


    private static String ip = "113.200.241.202";
    private static Integer port =63000;


    @Override
    public void run() {

    }

    public  static  void getResource(String url) throws Exception {


        Document html = Jsoup.connect("https://www.zhihu.com/people/jason5ng32/following")
                .timeout(2 * 1000)
                .proxy(ip, port)
                .get();

        //获取当前所爬取的URL的用户UrlToken
        String oldUrlToken = url.substring(url.lastIndexOf("/", url.lastIndexOf("/") - 1) + 1, url.lastIndexOf("/"));

        System.out.println(html);
        //解析到用户JSON  entities 其中有一个是自己的详细信息，其他时关注者的粗略信息
        org.jsoup.nodes.Element element = html.getElementById("data");
        String path = element.attr("data-state");
        JSONObject jsonObject = JSON.parseObject(path);
        JSONObject userJsonObject = jsonObject.getJSONObject("entities").getJSONObject("users");

        System.out.println(userJsonObject ==null);
        //插入本用户
        UserOfZhiHu zhiHu = JSON.parseObject(userJsonObject.getString(oldUrlToken), UserOfZhiHu.class);
        System.out.println(zhiHu==null);
        System.out.println(zhiHu.toString());

        //将其他用户拼接url插入爬取队列中
        Set<String> keys = userJsonObject.keySet();

        for (String key : keys) {
          //  System.out.println(key);
        }

    }

    public static void main(String[] args) {
        try {
            getResource("https://www.zhihu.com/people/jason5ng32/following");
        } catch (EOFException eof) {
            System.out.println("eof");
        }catch (SSLHandshakeException ssl){
            //代理出错，需要更换代理
            System.out.println("代理安全校验失败");
        }catch (SocketTimeoutException socketTimeoutException){
            System.out.println("代理连接超时");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
