package com.adapter.base.classes;
/**
 * 为用适配器（Adepter）去将目标（Target）和被适配者（Adeptee）两者联系起来，从而使得Target可以使用Adeptee中的属性方法。
 */

/**
 * 适配者(被适配的对象)
 */
public class Adaptee {
    public void adapteeSay(){
        System.out.println("I am Adaptee");
    }
}
