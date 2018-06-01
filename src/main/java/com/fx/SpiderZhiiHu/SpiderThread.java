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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SpiderThread implements Runnable{

    @Autowired
    private RedisUtil redisUtil;


    @Override
    public void run() {

    }

    public  void getResource(String url) throws Exception {

        // 已爬取队列
        // 待爬取队列    url
        // 异常队列
        // 错误队列

        // 判断是否爬过
      /*  if (redisUtil.hHasKey()){

        }*/


        Connection connection = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .timeout(3000000)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0");
        Document html = connection.get();

        //获取当前所爬取的URL的用户UrlToken
        String oldUrlToken = url.substring(url.lastIndexOf("/", url.lastIndexOf("/") - 1) + 1, url.lastIndexOf("/"));

        //解析到用户JSON  entities 其中有一个是自己的详细信息，其他时关注者的粗略信息
        org.jsoup.nodes.Element element = html.getElementById("data");
        String path = element.attr("data-state");
        JSONObject jsonObject = JSON.parseObject(path);
        JSONObject userJsonObject = jsonObject.getJSONObject("entities").getJSONObject("users");

        //插入本用户
        UserOfZhiHu zhiHu = JSON.parseObject(userJsonObject.getString(oldUrlToken), UserOfZhiHu.class);

        //将其他用户拼接url插入爬取队列中
        Set<String> keys = userJsonObject.keySet();

        for (String key : keys) {
            //他关注的队列
            //关注他的队列
        }
        System.out.println(zhiHu.toString());
    }
}
