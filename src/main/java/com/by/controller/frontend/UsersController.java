package com.by.controller.frontend;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.by.compoent.P2pConstants;
import com.by.pojo.Certification;
import com.by.service.CertificationService;
import com.by.util.SendCode;
import com.by.pojo.Users;
import com.by.service.UsersService;
import com.by.util.RandomNum;
import com.by.util.Result;
import com.by.util.ResultType;
import com.google.code.kaptcha.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @Autowired
    private CertificationService certificationService;

    /**
     * 判断用户名是否可用
     * @param unickname 用户名
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/verifyName",method = RequestMethod.POST)
    public Result verifyName(@RequestParam(value = "unickname",required = true) String unickname){
        Users users=usersService.queryUsers(unickname);
        if(users!=null){
            return Result.createTrueResult(ResultType.SUCCESS,"该用户名已存在");
        }
        return Result.createFalseResult(ResultType.ERROR,"该用户名可用");
    }


    /**
     * 验证电话号码是否已注册
     * @param uphonenumber
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/verifyPhone",method = RequestMethod.POST)
    public Result verifyPhone(@RequestParam(value = "uphonenumber",required = true) String uphonenumber){
        Users users=usersService.queryPhone(uphonenumber);
        if(users!=null){
            return Result.createFalseResult(ResultType.ERROR,"该电话号码已注册");
        }
        return Result.createTrueResult(ResultType.SUCCESS,"该电话号码可用");
    }

    /**
     * 注册发送短信获得验证码
     * @param uphonenumber 电话号码
     * @return
     * @throws ClientException
     */
    @ResponseBody
    @RequestMapping(value = "/verifyCode",method = RequestMethod.POST)
    public Result verifyCode(@RequestParam(value = "uphonenumber",required = true) String uphonenumber) throws ClientException {
        String getCodes=RandomNum.random;
        SendSmsResponse response=SendCode.sendSms(uphonenumber, getCodes);
        if(response.getCode().equals("OK")){
            return Result.createTrueResult(ResultType.SUCCESS,getCodes,"验证码发送成功");
        }
        return Result.createFalseResult(ResultType.ERROR,"验证码发送失败");
    }


    // 注册新用户
    @RequestMapping("regUser")
    public String insertUser(Users users, HttpServletRequest request,
                         @RequestParam(value = "username", required = true) String username,
                             @RequestParam(value = "password", required = true) String password,
                             @RequestParam(value = "phone", required = true) String phone,
                             @RequestParam(value = "recommender", required = true) String recommender) {
        users.setUnickname(username);
        //加密操作
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(password);
        users.setUpassword(encode);
        users.setUphonenumber(phone);
        if(recommender!=null&&recommender.equals("")){//推荐人
            users.setUreferrer(recommender);
        }
        // 将数据添加到数据库
        usersService.insertUser(users);//users.getUid()
        Users user=usersService.queryUsers(username);//获取新增用户的信息
        Certification cer = new Certification();
        cer.setCserial(user.getUid()+"");
        cer.setCbalance("0");
        cer.setCusername(recommender);
        cer.setCrealname("");
        cer.setCfreeze("0");
        cer.setCdue("0");
        cer.setCpaid("0");
        cer.setCtotalmoney("0");
        certificationService.insert(cer);
        request.getSession().setAttribute("username",user.getUnickname());
        // 返回到注册成功界面
        return "/frontend/register1";
    }


    /**
     * 重置密码----密码忘了按钮
     * @param password
     * @param phone
     * @return
     */
    @RequestMapping(value = "/regPass",method = RequestMethod.POST)
    public String regPass(@RequestParam(value = "password",required = true) String password,
                          @RequestParam(value = "phone",required = true) String phone){
        Users users=usersService.queryPhone(phone);//根据电话号码查到该用户
        System.out.println(users.toString());
        //加密操作
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(password);
        users.setUpassword(encode);
        Integer count=usersService.updateUsersPass(users);
        if(count>0){
            return "/frontend/login";
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/goLogin",method = RequestMethod.POST)
    public Result goLogin(@RequestParam(value = "unickname",required = true)String unickname,
                          @RequestParam(value = "upass",required = true)String upass,
                          @RequestParam(value = "kaptcha",required = true)String kaptcha,HttpSession session){
        String sysKaptcha = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);//获得系统生成的验证码
        Result rs=usersService.queryLoginUser(unickname,upass, kaptcha, sysKaptcha);
        if(rs.isSuccess()){
            session.setAttribute(P2pConstants.LOGIN_SESSION_KEY, rs.getData());
        }
        return rs;
    }

}
