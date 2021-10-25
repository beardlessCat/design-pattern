package com.adapter.advanced.adapter;

import com.adapter.advanced.cach.Cach;
import com.adapter.advanced.plate.AbstractPlateCach;

/**
 * MemcachedCach缓存适配器，用于适配MemcachedCach缓存
 */
public class MemcachedCachAdapter extends AbstractPlateCach {
    private Cach cach;

    public MemcachedCachAdapter(Cach cach) {
        this.cach = cach;
    }
    @Override
    public Object cachGet(String key) {
        return cach.get(key);
    }

    @Override
    public void cachRemove(String key) {
        cach.remove(key);
    }

    @Override
    public void cachPut(String key, String value) {
        cach.put(key,value);
    }
}
