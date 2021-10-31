package com.strategy;

import com.strategy.entity.Customer;
import com.strategy.factory.ChannelFactory;

public class ChannelFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Customer customer = null;
        CommonChannelStrategy tel = ChannelFactory.getChannelStrategy("TEL_CHANNEL");
        tel.specificCheckValidate(customer);
        CommonChannelStrategy sms = ChannelFactory.getChannelStrategy("SMS_CHANNEL");
        sms.specificCheckValidate(customer);
        CommonChannelStrategy wechat = ChannelFactory.getChannelStrategy("WECHAT");
        wechat.specificCheckValidate(customer);
    }

}
