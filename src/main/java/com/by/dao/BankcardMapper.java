package com.by.dao;

import com.by.pojo.Bankcard;

public interface BankcardMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    Bankcard selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}