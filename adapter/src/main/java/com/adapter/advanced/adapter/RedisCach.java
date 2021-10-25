package com.adapter.advanced.adapter;

import com.adapter.advanced.plate.AbstractPlateCach;

public class RedisCach extends AbstractPlateCach {

    @Override
    public Object cachGet(String key) {
        return null;
    }

    @Override
    public void cachRemove(String key) {

    }

    @Override
    public void cachPut(String key, String value) {

    }
}
