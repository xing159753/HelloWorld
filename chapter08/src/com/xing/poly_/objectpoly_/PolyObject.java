package com.xing.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {

        //animal 编译类型就是 Animal ,运行类型 Dog
        Animal animal = new Dog();
        animal.cry();
        //因为运行时，执行到改行时，animal运行类型是Dog,所以cry就是Dog的cry
        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new Cat();
        animal.cry();
    }
}
