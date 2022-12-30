package com.xing.super_;

public class B extends A {
    public int n1 = 888;
    public void test() {
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B类的cal() 方法...");
    }
    public void sum() {
        System.out.println("B类的sum() 方法....");
        //希望调用父类A的cal()方法
        //
       // cal();
       // this.cal();  //等价 cal
        super.cal(); //找 cal 方法的顺序是直接查找父类，其他的规则一样

        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }
    public B() {
       // super();
        super("jack",23);
    }

}
