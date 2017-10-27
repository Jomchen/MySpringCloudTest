package com.jomchen.web.controller;

import com.jomchen.common.util.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /*@RequestMapping(UrlConstants.TEST_GIT_CONFIG)
    @ResponseBody
    public String testGitConfig() {
        return "{name: " + personalUsername + ", password: " + personalPassword + "}";
    }*/

    /*@RequestMapping(UrlConstants.TEST_PUT_String)
    @ResponseBody
    public String putString(String name) {
        redisService.putString("name", name);
        return "success";
    }

    @RequestMapping(UrlConstants.TEST_GET_STRING)
    @ResponseBody
    public String getString(String name) {
        return redisService.getString(name);
    }*/

    @RequestMapping(UrlConstants.TEST_GO_TEST_PAGE)
    public String goTestPage() {
        return "/views/test/test";
    }

}
