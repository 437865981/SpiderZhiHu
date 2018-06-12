package com.fx.dao;

import com.fx.entity.UserOfZhiHu;
import com.fx.entity.UserOfZhiHuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserOfZhiHuMapper {
    int countByExample(UserOfZhiHuExample example);

    int deleteByExample(UserOfZhiHuExample example);

    int insert(UserOfZhiHu record);

    int insertSelective(UserOfZhiHu record);

    List<UserOfZhiHu> selectByExample(UserOfZhiHuExample example);

    int updateByExampleSelective(@Param("record") UserOfZhiHu record, @Param("example") UserOfZhiHuExample example);

    int updateByExample(@Param("record") UserOfZhiHu record, @Param("example") UserOfZhiHuExample example);
}