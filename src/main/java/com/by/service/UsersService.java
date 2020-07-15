package com.by.service;

import com.by.pojo.Users;

public interface UsersService {

    Users queryUsers(String unickname);

    Users queryPhone(String uphonenumber);
}
