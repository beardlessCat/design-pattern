package com.strategy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CustomerChannelEnum {
    /* 电话
     * 短信
     * 微信
     */
    TEL_CHANNEL("TEL_CHANNEL", "电话来源", "com.strategy.ChannelStrategy"),
    SMS_CHANNEL("SMS_CHANNEL", "短信来源", "com.strategy.SmsChannelStrategy"),
    WECHAT_CHANNEL("WECHAT", "微信来源", "com.strategy.WechatChannelStrategy");

    /**
     * 渠道编码
     */
    private final String channelCode;
    /**
     * 渠道名称
     */
    private final String channelName;
    /**
     * 渠道处理方法
     */
    private final String channelService;
}
