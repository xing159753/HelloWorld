package com.xing.override_;

public class Dog extends Animal{
    //因为Dog 是 Animal 的子类
    //Dog 的 cry()方法 和 Animal 的 cry()方法定义的形式一样（名称，返回类型，参数）
    //这时我们就说 Dog的cry方法，重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫...");
    }
    public String m1() {
        return null;
    }
//    public Object m2() {
//        return null;
//    }

    public void eat() {

    }
    public BBB m3() {
        return null;
    }
}

class AAA {

}
class BBB extends AAA {

}
