package com.by.dao;

import com.by.pojo.Withdrawal;

public interface WithdrawalMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Withdrawal record);

    int insertSelective(Withdrawal record);

    Withdrawal selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Withdrawal record);

    int updateByPrimaryKey(Withdrawal record);
}