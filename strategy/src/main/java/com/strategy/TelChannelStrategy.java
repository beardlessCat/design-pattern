package com.strategy;

import com.strategy.entity.Customer;

public class TelChannelStrategy extends CommonChannelStrategy{
    @Override
    public void specificCheckValidate(Customer customer) {
        System.out.println("specificCheckValidate result is:" + (customer.getAge() >= 18));
    }
}
