package com.adapter.base.classes;

/**
 * 客户端
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.say();
    }
}
