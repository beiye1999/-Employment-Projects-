package com.by.dao;

import com.by.pojo.Borrowcord;

public interface BorrowcordMapper {
    int deleteByPrimaryKey(Integer boid);

    int insert(Borrowcord record);

    int insertSelective(Borrowcord record);

    Borrowcord selectByPrimaryKey(Integer boid);

    int updateByPrimaryKeySelective(Borrowcord record);

    int updateByPrimaryKey(Borrowcord record);
}