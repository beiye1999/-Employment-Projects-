package com.by.dao;

import com.by.pojo.Details;

public interface DetailsMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
}