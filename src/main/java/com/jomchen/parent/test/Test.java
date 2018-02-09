package com.jomchen.parent.test;

import com.jomchen.parent.entity.Customer;
import com.jomchen.parent.entity.common.ColorEnum;
import com.jomchen.parent.service.CustomerService;
import com.jomchen.parent.service.impl.CustomerServiceImpl;

import java.lang.reflect.Proxy;
import java.util.Date;


/**
 * Create by Jomchen on 12:00 2017/10/24
 */
public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer(1, 20, "李寻欢", new Date(), "京城");
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        ((CustomerService) Proxy.newProxyInstance(
                customerService.getClass().getClassLoader(),
                customerService.getClass().getInterfaces(),
                (proxy, method, args_) -> {
                    System.out.println("开始。。。");
                    Object obj = method.invoke(customerService, args_);
                    System.out.println("结束。。。");
                    return obj;
                }
        )).handleCustomer(customer);


        ColorEnum colorEnum = ColorEnum.RED.getColorEnumByAttribute("红色");
        System.out.println(colorEnum);
    }
}
