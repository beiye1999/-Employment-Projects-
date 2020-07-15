package com.by.dao;

import com.by.pojo.Dope;

public interface DopeMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dope record);

    int insertSelective(Dope record);

    Dope selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dope record);

    int updateByPrimaryKey(Dope record);
}