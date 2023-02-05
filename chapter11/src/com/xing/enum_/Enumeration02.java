package com.xing.enum_;

public class Enumeration02 {
    public static void main(String[] args) {

        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}
//演示自定义枚举实现
class Season{
    private String name;
    private String desc;

    public static Season SPRING = new Season("春天","温暖");
    public static Season WINTER = new Season("冬天", "寒冷");
    public static Season AUTUMN = new Season("秋天", "凉爽");
    public static Season SUMMER = new Season("夏天", "炎热");

    //将构造器私有化目的防止直接 new
    //去掉setXxx 防止属性北秀给
    //在Season 内部 直接创建固定的对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
