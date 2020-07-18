package com.by.service.impl;

import com.by.dao.UsersMapper;
import com.by.pojo.Users;
import com.by.service.UsersService;
import com.by.util.Result;
import com.by.util.ResultType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    @Override
    public void insertUser(Users users) {
        usersMapper.insert(users);
    }

    @Override
    public Integer updateUsersPass(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public Result queryLoginUser(String unickname, String upass, String kaptcha, String sysKaptcha) {
        Users users=usersMapper.queryUsers(unickname);
        if(users==null){
            return Result.createFalseResult(ResultType.LOGIN,"用户名错误");
        }
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean flag = bCryptPasswordEncoder.matches(upass,users.getUpassword());
        if(!flag){
            return Result.createFalseResult(ResultType.LOGIN,"密码错误");
        }
        if(StringUtils.isBlank(kaptcha)||StringUtils.isBlank(sysKaptcha)||!kaptcha.equalsIgnoreCase(sysKaptcha)){
            return Result.createFalseResult(ResultType.KAPTCHAERROR,"请输入有效的验证码");
        }
        return Result.createTrueResult(ResultType.SUCCESS,users,"登录成功");
    }
}
