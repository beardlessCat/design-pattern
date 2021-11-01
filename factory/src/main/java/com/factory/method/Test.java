package com.factory.method;

public class Test {
    public static void main(String[] args) {
        ShoseFactory  adidasShose = new AdidasShoseFactory();
        adidasShose.produce().desc();


        ShoseFactory  nikeShose = new NikeShoseFactory();
        nikeShose.produce().desc();

    }
}
