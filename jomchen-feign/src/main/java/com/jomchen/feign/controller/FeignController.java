package com.jomchen.feign.controller;

import com.jomchen.feign.interfaces.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 11:56 2017/9/25
 */
@Controller
public class FeignController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/testZipkin")
    @ResponseBody
    public String testZipkin(@RequestParam String name) {
        return name + " testZipkin is SUCCESS";
    }

}
