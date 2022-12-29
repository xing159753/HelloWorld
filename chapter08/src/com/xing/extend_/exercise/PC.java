package com.xing.extend_.exercise;

public class PC extends Computer{
    private String brand;
    //这里IDEA 根据继承规则，自动把构造器的调用写好了
    //继承设计的基本思想，父类的构造器完成父类属性的初始化
    //子类的构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("PC信息=");
        System.out.println(getDetails() + " brand=" + brand);
    }

}
