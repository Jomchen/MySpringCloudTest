package com.jomchen.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Create by Jomchen on 9:36 2017/9/26
 */

@Aspect
@Component
public class WebAop {

    public static final Logger log = LoggerFactory.getLogger(WebAop.class);

    @Pointcut(value = "@annotation(com.jomchen.web.aop.MyLog)")
    public void point() {}

    @Around("point()")
    public void handlWeb(ProceedingJoinPoint pjp) {
        String name = pjp.getTarget().getClass().getName();
        String method = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        log.warn(name + "--" + method);
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            log.warn("控制层出错。。");
            throwable.printStackTrace();
        }
    }

}
