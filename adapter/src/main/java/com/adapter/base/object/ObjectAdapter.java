package com.adapter.base.object;

/**
 * 适配者
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee ;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void say() {
        adaptee.adapteeSay();
    }
}
