package com.jomchen.web.common;

/**
 * Create by Jomchen on 17:50 2017/10/17
 */
public class ResultObj {

    public static final int SUCCESS = 0;
    public static final int ERROR = 1;

    private int code;
    private String message;
    private Object obj;

    public ResultObj() {
    }

    public ResultObj(int code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getObj() {
        return obj;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
