package com.adapter.advanced.cach;

public interface Cach {

    Object get(String key);

    void remove(String key);

    void put(String key,String value );
}
