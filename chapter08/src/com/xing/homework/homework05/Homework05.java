package com.xing.homework.homework05;

public class Homework05 {
    public static void main(String[] args) {

        worker jack = new worker("jack", 10000);
        jack.setSalMonth(15);//灵活修改带薪月份
        jack.printSal();
        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();

        //老师测试
        Teacher teacher = new Teacher("shunping", 2000);
        //老师有课时费
        teacher.setClassDays(360);
        teacher.setClassSal(5000);
        teacher.printSal();

        //k科学家
        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(10000000);
        scientist.printSal();


    }
}
