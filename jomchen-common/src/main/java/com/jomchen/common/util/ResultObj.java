package com.jomchen.common.util;

/**
 * Create by Jomchen on 18:07 2017/10/26
 */
public class ResultObj<T> {

    Long code;

    String msg;

    T data;

    public ResultObj(ErrorEnum errorEnum, T data) {
        this.code = errorEnum.getCode();
        this.msg = errorEnum.getMsg();
        this.data = data;
    }

    public ResultObj(Long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
