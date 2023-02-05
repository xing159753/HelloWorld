package com.xing.innerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer08 {
    private int n1 = 10;
    public String name = "张三";
    class Inner08 {
        public void say() {
            System.out.println(" n1 = " + n1 + " name = " + name);
        }
    }
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}
