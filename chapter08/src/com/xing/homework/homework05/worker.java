package com.xing.homework.homework05;

public class worker extends Employee{//子类
    //属性
    //工人，农民，服务生只有基本工资 sal

    public worker(String name, double sal) {
        super(name, sal);
    }

    //方法
    @Override
    public void printSal() {
        System.out.print("工人 ");
        super.printSal();
    }

}
