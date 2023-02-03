package com.xing.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

        //new IA();
    }
}

//接口不能被实例化
interface IA {

    void say();
    void hi();
}
class Cat implements IA {//alt + enter
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }

}
abstract class Tiger implements IA {

}