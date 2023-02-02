package com.xing.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        //包装类，String是final类，不能被继承
    }
}
class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
final class AAA{
    //public final void cry() {}
}
