package com.by.dao;

import com.by.pojo.Approveitem;

public interface ApproveitemMapper {
    int deleteByPrimaryKey(Integer aiid);

    int insert(Approveitem record);

    int insertSelective(Approveitem record);

    Approveitem selectByPrimaryKey(Integer aiid);

    int updateByPrimaryKeySelective(Approveitem record);

    int updateByPrimaryKey(Approveitem record);
}