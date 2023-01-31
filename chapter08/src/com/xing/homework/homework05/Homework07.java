package com.xing.homework.homework05;

public class Homework07 {
    public static void main(String[] args) {

    }
}
class Test {
    String name = "Rose";
    Test() {
        System.out.println("Test");
    }
    Test(String name) {
        this.name = name;//这里把父类的 name 修改 John
    }
}
class Demo extends Test {
    String name = "jack";
    Demo() {
        super();
        System.out.println("Demo");
    }
    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name);//(3)Rose (5) john
        System.out.println(this.name);//(4)Jack (6) Jack
    }

    public static void main(String[] args) {
        //1.new Demo()
        new Demo().test();//匿名对象
        new Demo("john").test();//匿名
    }
}