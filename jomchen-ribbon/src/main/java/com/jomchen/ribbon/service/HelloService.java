package com.jomchen.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Create by Jomchen on 10:52 2017/9/25
 */
@Service("helloService")
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    @HystrixCommand(fallbackMethod = "testZipkinError")
    public String testZipkin(String name) {
        return restTemplate.getForObject("http://service-feign/testZipkin?name=" + name, String.class);
    }

    public String testZipkinError(String name) {
        return name + "testZipkinError is Error";
    }

    public String hiError(String name) {
        return name + " is Error";
    }

}
