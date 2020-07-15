package com.by.dao;

import com.by.pojo.Borrowmoney;

public interface BorrowmoneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Borrowmoney record);

    int insertSelective(Borrowmoney record);

    Borrowmoney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Borrowmoney record);

    int updateByPrimaryKey(Borrowmoney record);
}