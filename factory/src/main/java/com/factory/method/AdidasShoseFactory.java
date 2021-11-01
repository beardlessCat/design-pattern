package com.factory.method;

public class AdidasShoseFactory implements ShoseFactory{
    @Override
    public AbstractShoes produce() {
        return new AdidasShose();
    }
}
