package com.by.controller.frontend;
import com.by.pojo.Users;
import com.by.service.UsersService;
import com.by.util.Result;
import com.by.util.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UsersController {


    @Autowired
    private UsersService usersService;

    //注册新用户
    //注册新用户名是否可用
    @ResponseBody
    @RequestMapping(value = "/verifyName",method = RequestMethod.POST)
    public Result verifyName(@RequestParam(value = "unickname",required = true) String unickname){
        Users users=usersService.queryUsers(unickname);
        if(users!=null){
            return Result.createFalseResult(ResultType.ERROR,"该用户名已存在");
        }
        return Result.createTrueResult(ResultType.SUCCESS,"该用户名可用");
    }
    @ResponseBody
    @RequestMapping(value = "/verifyPhone",method = RequestMethod.POST)
    public Result verifyPhone(@RequestParam(value = "uphonenumber",required = true) String uphonenumber){
        Users users=usersService.queryPhone(uphonenumber);
        if(users!=null){
            return Result.createFalseResult(ResultType.ERROR,"该电话号码已注册");
        }
        return Result.createTrueResult(ResultType.SUCCESS,"该电话号码可用");
    }

}
