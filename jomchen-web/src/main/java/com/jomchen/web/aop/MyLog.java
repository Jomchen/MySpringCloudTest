package com.jomchen.web.aop;

import java.lang.annotation.*;

/**
 * Create by Jomchen on 9:42 2017/9/26
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {

    String  value() default "";
    int code();

}
