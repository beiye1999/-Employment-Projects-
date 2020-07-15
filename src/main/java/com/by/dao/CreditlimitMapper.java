package com.by.dao;

import com.by.pojo.Creditlimit;

public interface CreditlimitMapper {
    int deleteByPrimaryKey(Integer clid);

    int insert(Creditlimit record);

    int insertSelective(Creditlimit record);

    Creditlimit selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(Creditlimit record);

    int updateByPrimaryKey(Creditlimit record);
}