package com.by.dao;

import com.by.pojo.Poundage;

public interface PoundageMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Poundage record);

    int insertSelective(Poundage record);

    Poundage selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Poundage record);

    int updateByPrimaryKey(Poundage record);
}