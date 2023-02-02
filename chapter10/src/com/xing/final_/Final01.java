package com.xing.final_;

public class Final01 {
    public static void main(String[] args) {

        E e = new E();
        e.TAX_RATE = 0.09;
    }
}
//如果我们要求A类不能被其他类继承
//可以使用final修饰 A 类
final class A {

}
//class B extends A {}
class C {
    //如果我们要求hi不能被子类重写
    //可以使用final修饰 hi 方法
    public final void hi() {}
}
class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法...");
//    }
}
class E {
    public double TAX_RATE = 0.08;
}
//当不希望某个局部变量被修改，可以使用final修饰
class F {
    public void cry() {
        //这时 NUM也称为局部变量
        double NUM = 0.01;
        NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}
