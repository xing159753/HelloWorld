package com.xing.homework;

public class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse horse = new Horse();//饿汉式
    private VehiclesFactory(){}
    //创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    public static Horse getHorse() {
        //return new Horse();
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
