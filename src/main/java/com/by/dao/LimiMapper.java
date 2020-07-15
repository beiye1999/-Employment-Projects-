package com.by.dao;

import com.by.pojo.Limi;

public interface LimiMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Limi record);

    int insertSelective(Limi record);

    Limi selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Limi record);

    int updateByPrimaryKey(Limi record);
}