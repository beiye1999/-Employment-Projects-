package com.by.dao;

import com.by.pojo.Biao;

public interface BiaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Biao record);

    int insertSelective(Biao record);

    Biao selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Biao record);

    int updateByPrimaryKey(Biao record);
}