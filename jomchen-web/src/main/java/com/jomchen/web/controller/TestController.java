package com.jomchen.web.controller;

import com.jomchen.web.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 15:11 2017/9/25
 */
@Controller
public class TestController {

    /*@Autowired
    RedisService redisService;*/

    /*@Value("${personal.username}")
    private String personalUsername;
    @Value("${personal.password}")
    private String personalPassword;*/

    /*@RequestMapping("/testGitConfig")
    @ResponseBody
    public String testGitConfig() {
        return "{name: " + personalUsername + ", password: " + personalPassword + "}";
    }*/

    /*@RequestMapping("/putString")
    @ResponseBody
    public String putString(String name) {
        redisService.putString("name", name);
        return "success";
    }

    @RequestMapping("/getString")
    @ResponseBody
    public String getString(String name) {
        return redisService.getString(name);
    }*/

    @RequestMapping("/goTestPage")
    public String goTestPage() {
        return "/views/test/test";
    }

}
