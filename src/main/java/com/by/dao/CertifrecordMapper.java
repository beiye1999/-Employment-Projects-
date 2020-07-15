package com.by.dao;

import com.by.pojo.Certifrecord;

public interface CertifrecordMapper {
    int deleteByPrimaryKey(Integer crid);

    int insert(Certifrecord record);

    int insertSelective(Certifrecord record);

    Certifrecord selectByPrimaryKey(Integer crid);

    int updateByPrimaryKeySelective(Certifrecord record);

    int updateByPrimaryKey(Certifrecord record);
}