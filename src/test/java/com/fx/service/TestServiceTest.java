package com.fx.service;

import com.fx.entity.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestServiceTest {
    @Autowired
    private TestService testService;
    @Test
    public void addTestEntity() throws Exception {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(11);
        testEntity.setPassword("12111");
        testEntity.setUserName("14");
        testService.addTestEntity(testEntity);
    }

    @Test
    public void delTestEntityById() throws Exception {
    }

    @Test
    public void modifyTestEntity() throws Exception {
    }

    @Test
    public void queryTestEntityById() throws Exception {
    }

    @Test
    public void queryAllTestEntity() throws Exception {
    }

}