package com.jomchen.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Jomchen on 15:11 2017/9/25
 */
@Controller
public class TestController {

    @RequestMapping("/goTestPage")
    public String goTestPage() {
        System.out.println("经过了 Test 控制层");
        return "/views/test/test";
    }

}
