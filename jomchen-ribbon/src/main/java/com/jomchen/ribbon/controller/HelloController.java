package com.jomchen.ribbon.controller;

import com.jomchen.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 10:52 2017/9/25
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
