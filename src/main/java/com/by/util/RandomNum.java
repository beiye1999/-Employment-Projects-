package com.by.util;

//生成六位验证码的类
public class RandomNum {
       public static String random =(int) ((Math.random()*9+1)*100000)+"";
       public String getRandom(){
    	   return random;
       }
}
