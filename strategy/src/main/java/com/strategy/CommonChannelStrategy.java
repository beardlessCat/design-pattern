package com.strategy;

import com.strategy.entity.Customer;

public abstract class CommonChannelStrategy {

    public boolean commonCheckValidate(Customer customer) {
        return true ;
    }

    public abstract void specificCheckValidate(Customer customer);
}
