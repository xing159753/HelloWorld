package com.xing.extend_;

public class Sub extends Base{
//    public Sub(String name, int age) {
//        //super();
//        System.out.println("sub(String name, int age)....");
//    }
    public Sub() {
        super("smith",20);
        System.out.println("sub()....");
    }
    //当创建子类对象时，不管使用子类的那个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom",30);
        System.out.println("sub(String name)....");
    }
    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3 + " " );
        test100();
        test200();
        test300();
        callTest400();
        System.out.println("n4 = " + getN4());
    }

}
