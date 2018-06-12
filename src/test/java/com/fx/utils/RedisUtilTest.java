package com.fx.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class RedisUtilTest {
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void setRedisTemplate() throws Exception {
    }

    @Test
    public void expire() throws Exception {
        redisUtil.set("expire","expireValues");
        redisUtil.expire("expire",1);
        System.out.println(redisUtil.hasKey("expire"));  //true
        Thread.sleep(2000);
        System.out.println(redisUtil.hasKey("expire"));  //false
        System.out.println(redisUtil.get("expire"));   //null
    }

    @Test
    public void getExpire() throws Exception {
        redisUtil.set("expire","expireValues");
        System.out.println(redisUtil.getExpire("expire"));     //0
        redisUtil.expire("expire",2);
        Thread.sleep(1000);
        System.out.println(redisUtil.getExpire("expire"));     //1左右
    }

    @Test
    public void hasKey() throws Exception {
        redisUtil.set("expire","expireValues");
        System.out.println(redisUtil.hasKey("expire"));           //true
        System.out.println(redisUtil.hasKey("expire2"));         //false
    }

    @Test
    public void del() throws Exception {
        redisUtil.set("expire","delTest");
        System.out.println(redisUtil.get("expire"));          //delTest
        redisUtil.del("expire","12");                   //删除多个key
        System.out.println(redisUtil.hasKey("expire"));     //false
    }

    @Test
    public void get() throws Exception {
        redisUtil.set("expire","getValues");
        System.out.println(redisUtil.get("expire"));       //getValues
    }

    @Test
    public void set() throws Exception {
        redisUtil.set("expire","setValue");
        System.out.println(redisUtil.get("expire"));   //setValue
    }

    @Test
    public void set1() throws Exception {
        redisUtil.set("expire","setValueWithTime",1);
        System.out.println(redisUtil.get("expire"));                   //setValueWithTime
        Thread.sleep(1000);
        System.out.println(redisUtil.hasKey("expire"));             //false
    }

    @Test
    public void incr() throws Exception {
        redisUtil.set("expire",5,1);
        System.out.println(redisUtil.incr("expire",100));  //105
        System.out.println(redisUtil.get("expire"));                //105
    }

    @Test
    public void decr() throws Exception {
        redisUtil.set("expire",100,1000);
        System.out.println(redisUtil.decr("expire",66)); //34
        System.out.println(redisUtil.get("expire"));               //34
    }

    @Test
    public void hashGetItem() throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("mapKey1","mapValue1");
        map.put("mapKey2","mapValue2");
        map.put("mapKey3","mapValue3");
        redisUtil.hashSet("map",map);
        System.out.println(redisUtil.hashGetItem("map","mapKey2"));  //mapValue2
    }

    @Test
    public void hashGetAll() throws Exception {
        System.out.println(redisUtil.hashGetAll("map"));       //map1 2 3
    }

    @Test
    public void hashSet() throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("mapKey1","mapValue11");
        map.put("mapKey2","mapValue22");
        redisUtil.hashSet("map",map,1);
        System.out.println(redisUtil.hashGetAll("map"));   //map1 2
        Thread.sleep(1000);
        System.out.println(redisUtil.hashGetAll("map"));   //null
    }

    @Test
    /**
     *   hashSet 相当于在原先的基础上新增、修改
     */
    public void hashSet1() throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("mapKey1","mapValue111");
        map.put("mapKey2","mapValue222");
        map.put("mapKey4","mapValue444");
        redisUtil.hashSet("map",map);
        System.out.println(redisUtil.hashGetAll("map"));  //map1 23 4
    }

    @Test
    public void hashSetPush() throws Exception {
        redisUtil.hashSetPush("map","mapKey0","hashSetPushValue",1);
        System.out.println(redisUtil.hashGetAll("map"));   //mapKey1 hashSetPushValue  mapKey2 mapValue2
        Thread.sleep(1000);
        System.out.println(redisUtil.hashGetAll("map"));   //{}
    }

    @Test
    public void hashSetPush1() throws Exception {
        redisUtil.hashSetPush("map","mapKey2","hashSetPushValue2");
        redisUtil.hashSetPush("map","mapKey1","hashSetPushValue1");
        System.out.println(redisUtil.hashGetAll("map"));   //hashPushValue1 2
    }

    @Test
    public void hashDelItems() throws Exception {
        System.out.println(redisUtil.hashGetAll("map"));
        redisUtil.hashSetPush("map","mapKey3","mapValue3");
        redisUtil.hashSetPush("map","mapKey4","mapValue4");
        redisUtil.hashSetPush("map","mapKey5","mapValue5");
        System.out.println(redisUtil.hashGetAll("map"));
        redisUtil.hashDelItems("map","mapKey5");
        System.out.println(redisUtil.hashGetAll("map"));
    }

    @Test
    public void hashHasKey() throws Exception {
        System.out.println(redisUtil.hashHasKey("map","mapKey5"));
        System.out.println(redisUtil.hashHasKey("map","mapKey4"));
    }

    @Test
    public void hashIncr() throws Exception {
        System.out.println(redisUtil.hashGetAll("map"));
        System.out.println(redisUtil.hashIncr("map","mapKey4",50));
        System.out.println(redisUtil.hashGetAll("map"));
    }

    @Test
    public void hashDecr() throws Exception {
        System.out.println(redisUtil.hashGetAll("map"));
        System.out.println(redisUtil.hashDecr("map","mapKey1",50));
        System.out.println(redisUtil.hashGetAll("map"));
    }

    @Test
    public void setGet() throws Exception {
        Set set = new HashSet();
        set.add("123");
        set.add("456");
        set.add(789);

        System.out.println(redisUtil.setGet("set"));
        redisUtil.setSet("set",set);
        System.out.println(redisUtil.setGet("set"));
    }

    @Test
    public void setHasKey() throws Exception {
        System.out.println(redisUtil.setHasKey("set","789"));
        System.out.println(redisUtil.setHasKey("set",789));
    }

    @Test
    public void setSet() throws Exception {
        redisUtil.setSet("set",1,true,"string");
        System.out.println(redisUtil.setGet("set"));
    }

    @Test
    public void setSetAndTime() throws Exception {
        redisUtil.setSetAndTime("set",1000,2,false);
        System.out.println(redisUtil.setGet("set"));
        Thread.sleep(1000);
        System.out.println(redisUtil.setGet("set"));
    }

    @Test
    public void setGetSetSize() throws Exception {
        System.out.println(redisUtil.setGetSetSize("set"));
        redisUtil.setSet("set",1,true,"string");
        System.out.println(redisUtil.setGetSetSize("set"));
    }

    @Test
    public void setRemove() throws Exception {
        System.out.println(redisUtil.setGet("set"));
        redisUtil.setRemove("set","1");
        System.out.println(redisUtil.setGet("set"));
        redisUtil.setRemove("set",1);
        System.out.println(redisUtil.setGet("set"));
    }

    @Test
    public void listGet() throws Exception {
        List list = new ArrayList();
        list.add(1);
        list.add("stringValue");
        list.add(true);
        redisUtil.listSet("list",list);
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listGet("list",0,1));
    }

    @Test
    public void listGetListSize() throws Exception {
        System.out.println(redisUtil.listGetListSize("list"));
    }

    @Test
    public void listGetIndex() throws Exception {
        System.out.println(redisUtil.listGetIndex("list",0));
    }

    @Test
    public void listSetRightPush() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetRightPush("list","rightValue"));
        System.out.println(redisUtil.listGet("list",0,-1));
    }

    @Test
    public void listSetRightPush1() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetRightPush("list","rightValue2",1000));
        System.out.println(redisUtil.listGet("list",0,-1));
        Thread.sleep(1000);
        System.out.println(redisUtil.listGet("list",0,-1));

    }

    @Test
    public void listSetLeftPush() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetLeftPush("list","leftValue"));
        System.out.println(redisUtil.listGet("list",0,-1));
    }

    @Test
    public void listSetLeftPush1() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetLeftPush("list","leftValue2",1000));
        System.out.println(redisUtil.listGet("list",0,-1));
        Thread.sleep(1000);
        System.out.println(redisUtil.listGet("list",0,-1));
    }

    @Test
    public void listSetRightPop() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetRightPop("list"));
        System.out.println(redisUtil.listGet("list",0,-1));
    }

    @Test
    public void listSetLeftPop() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listSetLeftPop("list"));
        System.out.println(redisUtil.listGet("list",0,-1));
    }

    @Test
    public void listSet() throws Exception {

    }

    @Test
    public void listSet1() throws Exception {
    }

    @Test
    public void listUpdateIndex() throws Exception {
        System.out.println(redisUtil.listGetIndex("list",0));
        System.out.println(redisUtil.listUpdateIndex("list",0,"listUpdateValue"));
        System.out.println(redisUtil.listGetIndex("list",0));
    }

    @Test
    public void listRemove() throws Exception {
        System.out.println(redisUtil.listGet("list",0,-1));
        System.out.println(redisUtil.listRemove("list",3,"listUpdateValue"));
        System.out.println(redisUtil.listGet("list",0,-1));
    }

}