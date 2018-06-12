package com.fx.service;

import com.fx.entity.UserOfZhiHu;
import com.fx.entity.UserOfZhiHuExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserOfZhiHuService {

    int countByExample(UserOfZhiHuExample example);

    int deleteByExample(UserOfZhiHuExample example);

    int insert(UserOfZhiHu record);

    int insertSelective(UserOfZhiHu record);

    List<UserOfZhiHu> selectByExample(UserOfZhiHuExample example);

    int updateByExampleSelective(@Param("record") UserOfZhiHu record, @Param("example") UserOfZhiHuExample example);

    int updateByExample(@Param("record") UserOfZhiHu record, @Param("example") UserOfZhiHuExample example);

}
