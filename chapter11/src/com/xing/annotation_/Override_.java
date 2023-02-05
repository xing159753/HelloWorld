package com.xing.annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father {//父类

    public void fly() {
        System.out.println("Father flying...");
    }
    public void say(){

    }
}
class Son extends Father {//子类
    //1. @Override 注解放在fly方法上，表示子类的fly方法重写了父类的fly
    //2. 这里如果没有写 @Override 还是重写了父类的fly
    //3. 如果你写了 @Override 注解 ，编译器就会检查该方法是否真的写了父类的
    //   方法，如果的确写了，则编译通过，如果没有构成重写，则编译错误
    //4. 看看Override的定义
    // 如果发现@interface 表示一个注解类
    /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     */
    @Override
    public void fly() {
        System.out.println("Son flying...");
    }

    @Override
    public void say() {
    }
}
