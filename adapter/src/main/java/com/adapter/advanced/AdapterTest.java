package com.adapter.advanced;

import com.adapter.advanced.cach.Cach;
import com.adapter.advanced.cach.MemcachedCach;
import com.adapter.advanced.adapter.MemcachedCachAdapter;
import com.adapter.advanced.adapter.RedisCach;
import com.adapter.advanced.plate.PlateCach;

/**
 * 模拟新系统调用
 */
public class AdapterTest {
    public static void main(String[] args) {
        //可以使用简单工厂模式进行处理，根据不同需求获取不同的缓存对象
        //使用MemcachedCach缓存（兼容老接口）
        Cach cach = new MemcachedCach();
        PlateCach memcachedCach = new MemcachedCachAdapter(cach);
        //使用redis缓存（兼容新接口）
        PlateCach redisCach = new RedisCach();
    }
}
