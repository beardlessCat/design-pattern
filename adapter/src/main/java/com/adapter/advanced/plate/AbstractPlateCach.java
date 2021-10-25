package com.adapter.advanced.plate;

/**
 * 平台缓存缓存接口（新）
 */
public abstract class AbstractPlateCach implements PlateCach{
    public void monitor(){
        /**
         * 公共监控方案吗
         */
    }
    public abstract Object cachGet(String key);

    public abstract void cachRemove(String key);

    public abstract void cachPut(String key,String value );
}
