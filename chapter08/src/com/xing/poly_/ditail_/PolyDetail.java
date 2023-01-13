package com.xing.poly_.ditail_;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Object obj = new Cat();
        System.out.println("ok~");
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        Cat cat = (Cat) animal;
        cat.catchMouse();
        Dog dog = (Dog) animal;
    }
}
