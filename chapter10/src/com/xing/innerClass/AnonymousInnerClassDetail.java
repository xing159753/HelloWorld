package com.xing.innerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {

    }
}
class Outer05 {
    private int n1 = 99;
    public void f1() {
        Person p = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法");
                System.out.println(n1 + "外部类的n1" + Outer05.this.n1);
            }

        };
        p.hi();
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法 haha");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    }
}
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person hi()");
    }
}
