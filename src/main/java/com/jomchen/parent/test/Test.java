package com.jomchen.parent.test;

import com.jomchen.parent.entity.Customer;
import com.jomchen.parent.entity.common.ColorEnum;
import com.jomchen.parent.service.CustomerService;
import com.jomchen.parent.service.impl.CustomerServiceImpl;

import java.lang.reflect.Proxy;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.regex.Pattern;


/**
 * Create by Jomchen on 12:00 2017/10/24
 */
public class Test {
    public static void main(String[] args) {

        /*Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getMonthValue());*/

        /*LocalDateTime now = LocalDateTime.now();
        LocalDateTime myTime = LocalDateTime.of(
            2018, 05, 20,
                22, 22, 22,
                00
        );
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime newTime = myTime.plusDays(1).withDayOfMonth(1);
        System.out.println(myTime.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond());
        System.out.println("now: " + dateTimeFormatter.format(now));
        System.out.println("myTime: " + dateTimeFormatter.format(myTime));
        System.out.println("newTime: " + dateTimeFormatter.format(newTime));*/

        String dateTimeStr = "2008-08-08 08:08:08";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, dateTimeFormatter);
        System.out.println(dateTimeFormatter.format(localDateTime));


    }
}
