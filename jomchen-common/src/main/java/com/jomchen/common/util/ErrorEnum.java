package com.jomchen.common.util;

/**
 * Create by Jomchen on 18:08 2017/10/26
 */
public enum ErrorEnum {


    SUCCESS(0L, "请求成功"),
    ERROR(1L, "请求失败");

    Long code;
    String msg;

    ErrorEnum(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }



}
