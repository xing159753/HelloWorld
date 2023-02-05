package com.xing.innerClass;

public class StaticInnerClass01 {
    public static void main(String[] args) {

        Outer10 outer10 = new Outer10();
        outer10.m1();

        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        Outer10.Inner10 inner101 = Outer10.getInner10();
        System.out.println("==========");
        inner101.say();
        Outer10.Inner10 inner10_ = Outer10.getInner10_();


    }
}
class Outer10 {
    private int n1 = 10;
    private static String name = "张三";
    public static void cry() {}
    static class Inner10 {
        public void say() {
            System.out.println(name);
            cry();
        }
    }
    public void m1() {
        Inner10 inner10 = new Inner10();
    }
    public  static Inner10 getInner10() {
        return new Inner10();
    }
    public static Inner10 getInner10_() {
        return new Inner10();
    }
}
