package com.xing.poly_.ditail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        Object obj = new Object();
        System.out.println(obj instanceof AA);
        String str = "hello";
        System.out.println(str instanceof Object);
    }
}
class AA {

}
class BB extends AA {}
