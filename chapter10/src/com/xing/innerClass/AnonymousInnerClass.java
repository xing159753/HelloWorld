package com.xing.innerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 {
    private int n1 = 10;
    public void method() {

        IA tiger = new Tiger();
        tiger.cry();

    }
}
interface IA {
    public void cry();
}
class Tiger implements IA {

    @Override
    public void cry() {
        System.out.println("老虎叫");
    }
}

class Dog implements IA {

    @Override
    public void cry() {
        System.out.println("小狗汪汪");
    }
}

class Father {
    public Father(String name) {

    }
    public void test() {

    }
}
