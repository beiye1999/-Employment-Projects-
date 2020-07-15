package com.by.dao;

import com.by.pojo.Userauditor;

public interface UserauditorMapper {
    int deleteByPrimaryKey(Integer uaid);

    int insert(Userauditor record);

    int insertSelective(Userauditor record);

    Userauditor selectByPrimaryKey(Integer uaid);

    int updateByPrimaryKeySelective(Userauditor record);

    int updateByPrimaryKey(Userauditor record);
}