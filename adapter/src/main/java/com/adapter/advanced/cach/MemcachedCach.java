package com.adapter.advanced.cach;

/**
 * adaptee (老接口，被适配者)
 */
public class MemcachedCach implements Cach{

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void remove(String key) {

    }

    @Override
    public void put(String key, String value) {

    }
}
