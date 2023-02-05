package com.xing.enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);
    }
}
//演示使用enum关键字来实现枚举类
enum  Season2 {


//    public static Season SPRING = new Season("春天","温暖");
//    public static Season WINTER = new Season("冬天", "寒冷");
//    public static Season AUTUMN = new Season("秋天", "凉爽");
//    public static Season SUMMER = new Season("夏天", "炎热");

    //如果使用了enum来实现枚举
    //1 使用关键字 enum 代替 class
    //2. public static Season SPRING = new Season("春天","温暖"); 直接使用
    // SPRING("春天","温暖") 解读  常量名(实参类表)
    //3. 如果有多个常量(对象)，使用 ，号 间隔即可
    //4. 如果使用enum 来实现枚举要求将定义常量对象，写在前面
    SPRING("春天","温暖"),
    WINTER("冬天", "寒冷"),AUTUMN("秋天", "凉爽"),SUMMER("夏天", "炎热");
    private String name;
    private String desc;


    private Season2(String name, String desc) {
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
