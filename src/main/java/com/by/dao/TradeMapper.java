package com.by.dao;

import com.by.pojo.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}