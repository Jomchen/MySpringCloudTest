package com.jomchen.web.controller;

import com.jomchen.web.aop.MyLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 9:51 2017/9/25
 */
@Controller
public class WebController {

    @RequestMapping("/")
    @ResponseBody
    public String webHomne() {
        System.out.println("经过了控制层。。。。");
        return "Hello, this is Web";
    }

}
