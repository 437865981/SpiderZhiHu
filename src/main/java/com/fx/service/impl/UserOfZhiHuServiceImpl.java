package com.fx.service.impl;

import com.fx.dao.UserOfZhiHuMapper;
import com.fx.entity.UserOfZhiHu;
import com.fx.entity.UserOfZhiHuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOfZhiHuServiceImpl  implements UserOfZhiHuMapper{

    @Autowired
    private UserOfZhiHuMapper userOfZhiHuMapper;

    @Override
    public int countByExample(UserOfZhiHuExample example) {
        return this.userOfZhiHuMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserOfZhiHuExample example) {
        return this.userOfZhiHuMapper.deleteByExample(example);
    }

    @Override
    public int insert(UserOfZhiHu record) {
        return this.userOfZhiHuMapper.insert(record);
    }

    @Override
    public int insertSelective(UserOfZhiHu record) {
        return this.userOfZhiHuMapper.insertSelective(record);
    }

    @Override
    public List<UserOfZhiHu> selectByExample(UserOfZhiHuExample example) {
        return this.userOfZhiHuMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UserOfZhiHu record, UserOfZhiHuExample example) {
        return this.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(UserOfZhiHu record, UserOfZhiHuExample example) {
        return this.userOfZhiHuMapper.updateByExample(record,example);
    }
}
