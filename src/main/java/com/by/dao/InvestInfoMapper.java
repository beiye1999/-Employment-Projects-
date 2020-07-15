package com.by.dao;

import com.by.pojo.InvestInfo;

public interface InvestInfoMapper {
    int deleteByPrimaryKey(Integer inid);

    int insert(InvestInfo record);

    int insertSelective(InvestInfo record);

    InvestInfo selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(InvestInfo record);

    int updateByPrimaryKey(InvestInfo record);
}