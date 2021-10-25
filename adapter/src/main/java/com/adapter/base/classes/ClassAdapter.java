package com.adapter.base.classes;

/**
 * 适配者
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void say() {
        adapteeSay();
    }
}
