package com.jomchen.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create by Jomchen on 10:16 2017/9/25
 */
@SpringBootApplication
@EnableEurekaClient
public class EureclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureclientApplication.class, args);
    }
}
