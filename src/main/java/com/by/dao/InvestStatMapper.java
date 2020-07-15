package com.by.dao;

import com.by.pojo.InvestStat;

public interface InvestStatMapper {
    int deleteByPrimaryKey(Integer isid);

    int insert(InvestStat record);

    int insertSelective(InvestStat record);

    InvestStat selectByPrimaryKey(Integer isid);

    int updateByPrimaryKeySelective(InvestStat record);

    int updateByPrimaryKey(InvestStat record);
}