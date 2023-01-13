package com.xing.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub1 s1 = new Sub1();
        System.out.println(s1.count);
        s1.display();
        Base1 b = s1;
        System.out.println(b == s1);
        System.out.println(b.count);
        b.display();
    }
}
class Base1 {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
class Sub1 extends Base1 {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
