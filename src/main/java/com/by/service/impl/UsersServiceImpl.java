package com.by.service.impl;

import com.by.dao.UsersMapper;
import com.by.pojo.Users;
import com.by.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired(required = false)
    private UsersMapper usersMapper;

    @Override
    public Users queryUsers(String unickname) {
        return usersMapper.queryUsers(unickname);
    }

    @Override
    public Users queryPhone(String uphonenumber) {
        return usersMapper.queryPhone(uphonenumber);
    }
}
