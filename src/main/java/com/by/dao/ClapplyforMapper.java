package com.by.dao;

import com.by.pojo.Clapplyfor;

public interface ClapplyforMapper {
    int deleteByPrimaryKey(Integer clpid);

    int insert(Clapplyfor record);

    int insertSelective(Clapplyfor record);

    Clapplyfor selectByPrimaryKey(Integer clpid);

    int updateByPrimaryKeySelective(Clapplyfor record);

    int updateByPrimaryKey(Clapplyfor record);
}