package com.strategy.factory;

import com.strategy.CommonChannelStrategy;
import com.strategy.enums.CustomerChannelEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ChannelFactory {
    /**
     * 存放不同渠道来源名单的处理实例bean
     * telChannelService
     * smsChannelService
     * wechatChannelService
     */
    private static final Map<String, String> SERVICE_BEAN_MAP = new HashMap<>(3);

    static {
        for (CustomerChannelEnum channel : CustomerChannelEnum.values()) {
            SERVICE_BEAN_MAP.put(channel.getChannelCode(), channel.getChannelService());
        }
    }


    public static CommonChannelStrategy getChannelStrategy(String channelCode) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = SERVICE_BEAN_MAP.get(channelCode);
        return (CommonChannelStrategy) Class.forName(className).newInstance();
    }
}
