package com.xing.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {

        new BBB();// 0 AAA的普通代码块 1 AAA() 构造器被调用了 2 BBB的普通代码块 3 BBB() 构造器被调用了
    }
}
class AAA {//父类Object

    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        //super();
        //调用本类的普通代码块
        System.out.println("AAA() 构造器被调用了");
    }
}
class BBB extends AAA{

    {
        System.out.println("BBB的普通代码块");
    }
    public BBB() {
        //super();
        //调用本类的普通代码块
        System.out.println("BBB() 构造器被调用了");
    }
}
