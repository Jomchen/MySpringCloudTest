package com.jomchen.parent.service.impl;

import com.jomchen.parent.entity.Customer;
import com.jomchen.parent.service.CustomerService;

/**
 * create by Jomchen on 2018/2/9
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void handleCustomer(Customer customer) {
        System.out.println(customer.getCname());
    }

}
