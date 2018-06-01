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
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <dl>
 * <dt>SplideZhiHu</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/15</dd>
 * </dl>
 *通过用户关注递归的爬取用户信�?
 * @author ${纔訾}
 */
public class SplideZhiHu {

    /**
     * 保存关注的人
     */
    private static Map<String,List> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        getResource("https://www.zhihu.com/people/zhu-qing-ying-73-18/following");
    }
    //根据当前url得到�?有关注的�?
    public static void getFollowing(String url) throws IOException{

    }
    public static void getResource(String url) throws IOException{
        System.out.println(url);
        Connection connection = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .timeout(50000)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0");
        Document html = connection.get();
        //获取class为Avatar Avatar--large UserAvatar-inner的元�?
        Elements elements= html.getElementsByClass("Avatar Avatar--large UserAvatar-inner");
       /* for (Element element : elements){
            //获取属�?�为srcset的�??
            String a =element.attr("srcset");
            if (a.contains("2x")){
                downloadImg(a.substring(0,a.length()-3),"D:\\images\\");
            }
        }*/


        //获取原始的urlToken
        int start = url.indexOf("people");
        int end = url.indexOf("follow");
        String oldUrlToken = url.substring(start+7,end-1);
        System.out.println(oldUrlToken);
        //https://www.zhihu.com/org/ao-di-66-50/following
        //获取关注的人的中英文�?
        Element element= html.getElementById("data");
        String path = element.attr("data-state");
        JSONObject jsonObject = JSON.parseObject(path);
        JSONObject userJsonObject =jsonObject.getJSONObject("entities").getJSONObject("users");
        //存放已存在的List
        Set<Map.Entry<String, Object>> entries = userJsonObject.entrySet();
        List<ZhiHuUser> list = new ArrayList<>();
        for (Map.Entry<String,Object> entry: entries
                ) {
            ZhiHuUser user = JSON.parseObject(entry.getValue().toString(),ZhiHuUser.class);
            list.add(user);

        }
        map.put(oldUrlToken,list);
        for (Map.Entry<String,Object> entry: entries
             ) {  //mich xiaoguai mo-qi
            ZhiHuUser user = JSON.parseObject(entry.getValue().toString(),ZhiHuUser.class);
            // System.out.println(user.toString());
            String urlChild = "https://www.zhihu.com/people/urlToken/following";
            String myUrl = urlChild.replace("urlToken",user.getUrlToken());
            //没关注的人或者到了自�?
            if( (entries.size()==1) || entry.getKey().equals(oldUrlToken)){
                continue;
            }
            if( map.containsKey(entry.getKey())){
                continue;
            }

            try {
                //互相关注的，后面�?个不遍历
                //entries.
                getResource(myUrl);
            }catch (Exception e){
                continue;
            }

        }

    }

    /**
     * 下载图片到指定路�?
     * @param url 图片原始路径
     * @param path 下载的本地的路径
     */
    public static void downloadImg(String url,String path) {
        File file = null;
        FileOutputStream fos = null;
        String downloadName = url.substring(url.lastIndexOf("/") + 1);
        HttpURLConnection httpCon = null;
        URLConnection con = null;
        URL urlObj = null;
        InputStream in = null;
        byte[] size = new byte[1024];
        int num = 0;
        try {
            file = new File(path + downloadName);
            fos = new FileOutputStream(file);
            if (url.startsWith("http")) {
                //下面这两句话有问�?
                urlObj = new URL(url);
                con = urlObj.openConnection();
                httpCon = (HttpURLConnection) con;
                in = httpCon.getInputStream();
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

    public static void getFollowPeoples(String resourcPath){
            String b =resourcPath;
            String index="&quot;,&quot";
            Matcher slashMatcher = Pattern.compile("headline").matcher(b);
            int i =0;
            int j = 0;
            int mIdx = 0;
            while(slashMatcher.find()) {
                mIdx++;
                //7,&quot;name&quot;:&quot;钻石太太Caroline&quot;,&quot;
                String path = b.substring(slashMatcher.start()-50,slashMatcher.start());
                //  System.out.println(path);
                int nameIndex = path.indexOf("name");
                if( nameIndex > 0 ){
                    System.out.println(path.substring(nameIndex+17,path.length()-13));
                }

            }
            System.out.println(mIdx);
            mIdx=0;
            slashMatcher = Pattern.compile("urlToken").matcher(b);
            while(slashMatcher.find()) {
                mIdx++;
                //niu-yong-ming-14&quot;,&quot;participat
                String path = b.substring(slashMatcher.start()+21,slashMatcher.start()+100);
                //  System.out.println(path);
                Matcher indexMatcher = Pattern.compile(index).matcher(path);

                while(indexMatcher.find()) {
                    System.out.println(path.substring(0,indexMatcher.start()));
                    j++;
                    break; //只获取匹配的第一�?
                }
            }
            System.out.println(j);
        }

}
