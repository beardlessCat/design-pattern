package com.adapter.advanced.plate;

/**
 * 平台缓存缓存接口（新）
 */
public interface PlateCach {

    Object cachGet(String key);

    void cachRemove(String key);

    void cachPut(String key,String value );
}
