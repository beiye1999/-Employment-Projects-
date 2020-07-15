package com.by.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
