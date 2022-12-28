package com.xing.modifier;

public class B {
    public void say() {
        A a = new A();
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3);
        //在同一个包下， 可以访问 public , protected, 和默认修饰属性和方法 ，不能访问private
        a.m1();
        a.m2();
        a.m3();
    }
}
