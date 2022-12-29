package com.xing.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {

        CC cc = new CC();
    }
}
class AA {
    public AA() {
        System.out.println("我是AA类");
    }
}
class BB extends AA {
    public BB () {
        System.out.println("我是BB类的无参构造器");
    }
    public BB(String name) {
        System.out.println(name + "我是BB类的有参构造器");
    }
}
class CC extends BB {
    public CC() {
        this("hello");
        System.out.println("我是CC类的无参构造器");
    }
    public CC(String name) {
        super("hahaha");
        System.out.println("我是CC类的有参构造");
    }
}
