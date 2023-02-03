package com.xing.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}
interface A {
    int x = 0;
}
class B {
    int x = 1;
}//普通属性
class C extends B implements A {
    public void pX() {
        System.out.println(A.x + super.x);
        //错误 原因不明确
        //访问接口的x就使用A.x
        //访问父类的 x 就使用 super.x
    }

    public static void main(String[] args) {
        new C().pX();
    }
}