package com.strategy;

import com.strategy.entity.Customer;

public class SmsChannelStrategy extends CommonChannelStrategy{

    @Override
    public void specificCheckValidate(Customer customer) {
        System.out.println("specificCheckValidate result is:" + (customer.getAge() >= 12));
    }
}
