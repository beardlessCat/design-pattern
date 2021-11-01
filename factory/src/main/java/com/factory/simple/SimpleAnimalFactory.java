package com.factory.simple;

public class SimpleAnimalFactory {
    public static final int TYPE_CAT = 1;
    public static final int TYPE_DOG = 2;
    public static final int TYPE_Cattle = 3;

    public static AbstractAnimal createNoodles(int type) {
        switch (type) {
            case TYPE_CAT:
                return new Cat();
            case TYPE_DOG:
                return new Dog();
            case TYPE_Cattle:
            default:
                return new Cattle();
        }
    }

    public static void main(String[] args) {
        SimpleAnimalFactory.createNoodles(TYPE_CAT).bark();
        SimpleAnimalFactory.createNoodles(TYPE_DOG).bark();
        SimpleAnimalFactory.createNoodles(TYPE_Cattle).bark();
    }
}
