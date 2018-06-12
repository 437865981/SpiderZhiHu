package com.fx.service.impl;

import com.fx.entity.UserOfZhiHu;
import com.fx.entity.UserOfZhiHuExample;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserOfZhiHuServiceImplTest {

    @Autowired
    private UserOfZhiHuServiceImpl userOfZhiHuService;

    private UserOfZhiHuExample example = new UserOfZhiHuExample();
    @Before
    public void init(){
        example.setDistinct(true);
        example.setOrderByClause("id");

        System.out.println("init:"+example.toString());
    }
    @Test
    public void countByExample() throws Exception {
        System.out.println(userOfZhiHuService.countByExample(example));
    }

    @Test
    public void deleteByExample() throws Exception {
        userOfZhiHuService.deleteByExample(example);
    }

    @Test
    public void insert() throws Exception {
        UserOfZhiHu record = new UserOfZhiHu();
        record.setId("1234");
        record.setAccountstatus("test1");
        userOfZhiHuService.insert(record);
    }

    @Test
    public void insertSelective() throws Exception {
        UserOfZhiHu record = new UserOfZhiHu();
        record.setAccountstatus("5678");
        record.setAllowmessage("test2");
        record.setId("123");
        userOfZhiHuService.insertSelective(record);
    }

    @Test
    public void selectByExample() throws Exception {
        System.out.println(userOfZhiHuService.selectByExample(example).size());
    }

    @Test
    public void updateByExampleSelective() throws Exception {
        UserOfZhiHu record = new UserOfZhiHu();
        record.setId("5678");
        record.setAccountstatus("test2");
        userOfZhiHuService.updateByExampleSelective(record,example);
    }

    @Test
    public void updateByExample() throws Exception {
        UserOfZhiHu record = new UserOfZhiHu();
        record.setId("5678");
        record.setAccountstatus("test2");
        userOfZhiHuService.updateByExample(record,example);
    }

}