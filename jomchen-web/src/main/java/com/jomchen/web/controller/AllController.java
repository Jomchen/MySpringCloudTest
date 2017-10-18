package com.jomchen.web.controller;

import com.jomchen.web.common.ResultObj;
import com.jomchen.web.common.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Jomchen on 16:58 2017/10/17
 */
@Controller
public class AllController {

    @RequestMapping(UrlConstants.ALL_PAGE_00)
    public String page_00() {
        return "/views/all/page_00";
    }

    @RequestMapping(value = UrlConstants.ALL_PAGE_00_AJAX, method = RequestMethod.POST)
    @ResponseBody
    public ResultObj page_00_ajax(String name) {
        // TODO AJAX 如果返回字符串会请求失败，一直未解决
        ResultObj resultObj = new ResultObj();
        resultObj.setCode(ResultObj.SUCCESS);
        resultObj.setObj(name);
        return resultObj;
    }

    @RequestMapping(UrlConstants.ALL_WEB_SOCKET_PAGE)
    public String web_socket_page() {
        return "/views/all/web_socket_page";
    }

}
