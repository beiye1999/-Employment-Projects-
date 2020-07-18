package com.by.controller.frontend;

import com.by.util.KaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通用的，公共的
 * @author 林国贝
 * 2020-7-13 19:36:35
 */
@Controller
public class SystemConteoller {

    //rest 风格
    @GetMapping("/frontend/{view}.html")
    public String view(@PathVariable("view")String view){

        return "/frontend/"+view;
    }

    /**
     * 验证码
     * @param response
     * @param session
     */
    @GetMapping("/kaptcha")
    public void kaptcha(HttpServletResponse response, HttpServletRequest request){
        KaptchaUtil.responseImg(request, response);
    }
}
