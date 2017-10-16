package com.jomchen.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 15:11 2017/9/25
 */
@Controller
public class TestController {

    @Value("${personal.username}")
    private String personalUsername;
    @Value("${personal.password}")
    private String personalPassword;

    @RequestMapping("/goTestPage")
    public String goTestPage() {
        return "/views/test/test";
    }

    @RequestMapping("/testGitConfig")
    @ResponseBody
    public String testGitConfig() {
        return "{name: " + personalUsername + ", password: " + personalPassword + "}";
    }

}
