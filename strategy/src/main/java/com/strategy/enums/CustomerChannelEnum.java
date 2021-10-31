package com.strategy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CustomerChannelEnum {
    /* �绰
     * ����
     * ΢��
     */
    TEL_CHANNEL("TEL_CHANNEL", "�绰��Դ", "com.strategy.ChannelStrategy"),
    SMS_CHANNEL("SMS_CHANNEL", "������Դ", "com.strategy.SmsChannelStrategy"),
    WECHAT_CHANNEL("WECHAT", "΢����Դ", "com.strategy.WechatChannelStrategy");

    /**
     * ��������
     */
    private final String channelCode;
    /**
     * ��������
     */
    private final String channelName;
    /**
     * ����������
     */
    private final String channelService;
}
