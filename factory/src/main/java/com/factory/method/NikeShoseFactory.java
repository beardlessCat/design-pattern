package com.factory.method;

public class NikeShoseFactory implements ShoseFactory {
    @Override
    public AbstractShoes produce() {
        return new NikeShoes();
    }
}
