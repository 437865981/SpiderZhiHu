package com.fx.test;

import com.fx.dao.TestDao;
import com.fx.entity.TestEntity;
import com.fx.service.TestService;
import com.fx.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class RedisUtilTest {

    @Autowired
     private TestService testService;

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void listTest(){

        System.out.println("redisTemplate:"+redisTemplate);
        System.out.println(redisTemplate.hasKey("KEY"));
        redisUtil.setRedisTemplate(redisTemplate);
        redisUtil.lSet("List","123");
        redisUtil.lSet("List",345);
        redisUtil.lSet("List","fx");

        System.out.println("List Size:"+redisUtil.lGetListSize("List"));
        System.out.println("List value:"+redisUtil.lGetIndex("List",2));
        System.out.println("List all:"+redisUtil.lGet("List",0,2));
        System.out.println("List all2:"+redisUtil.lGet("List",1,-1));
    }

    @Test
    public  void addTest(){
        TestEntity testEntity = new TestEntity(1,"23","434");
        testService.addTestEntity(testEntity);

        testEntity = new TestEntity(2,"fx","1212");
        testService.addTestEntity(testEntity);
    }
    @Test
    public  void delTest(){
        testService.delTestEntityById(1);
    }
    @Test
    public  void updateTest(){
        TestEntity testEntity = new TestEntity(2,"fangxiong","456");

        testService.modifyTestEntity(testEntity);
    }
    @Test
    public  void queryTest(){
        System.out.println(testService.queryTestEntityById(1));
        System.out.println(testService.queryAllTestEntity());
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379,112,13);
        jedis.auth("123456");
        System.out.println(jedis.keys("*"));
    }
}
