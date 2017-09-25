package com.jomchen.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 10:21 2017/9/25
 */
@Controller
public class EurekaclientController {

    @Value("${server.port}")
    private int port;


    @RequestMapping("/hi")
    @ResponseBody
    public String clientHome(String name) {
        return "hi " + name + ",i am from port: " + port;
    }
}
