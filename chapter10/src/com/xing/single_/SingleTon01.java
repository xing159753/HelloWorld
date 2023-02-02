package com.xing.single_;

import jdk.nashorn.internal.ir.CallNode;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}

//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend {
    private String name;
    //public static int n1 = 100;
    private  static GirlFriend gf = new GirlFriend("小红红");

    //如何保障我们只能创建一个GirlFriend对象
    //单例模式 - 饿汉式
    //将构造器私有化
    //在类的内部直接创建
    //提供一个公共的static 方法，返回 gf对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
