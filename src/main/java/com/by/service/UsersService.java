package com.by.service;

import com.by.pojo.Users;
import com.by.util.Result;

public interface UsersService {

    Users queryUsers(String unickname);

    Users queryPhone(String uphonenumber);

    void insertUser(Users users);

    Integer updateUsersPass(Users users);

    Result queryLoginUser(String unickname, String upass, String kaptcha, String sysKaptcha);
}

