package com.by.Test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        // springsecurity 注册加密方法
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean encode = bCryptPasswordEncoder.matches("qqqqqqqqqq","$2a$10$B5nOS1DFmsQ/cR9FYmOlIeP3InOsbskm6fkS9NK8d5Jtn0VuKvAnC");
        System.out.println(encode);
    }
}
