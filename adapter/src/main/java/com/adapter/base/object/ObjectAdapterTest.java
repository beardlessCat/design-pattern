package com.adapter.base.object;

/**
 * 客户端
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.say();
    }
}
