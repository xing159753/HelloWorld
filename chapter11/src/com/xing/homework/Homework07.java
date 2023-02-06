package com.xing.homework;

public class Homework07 {
    public static void main(String[] args) {

        //实例化不同的car对象
        Car2 car2 = new Car2(60);
        car2.getAir().flow();
        Car2 car21 = new Car2(-1);
        car21.getAir().flow();
        Car2 car22 = new Car2(20);
        car22.getAir().flow();
    }
}
class Car2 {
    private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    //Air 成员内部类
    class Air {
        public void flow() {
            if(temperature > 40) {
                System.out.println("温度大于40 空调吹冷气");
            } else if(temperature < 0) {
                System.out.println("温度小于0 空调吹暖气");
            } else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }
    //返回一个Air对象
    public Air getAir() {
        return new Air();
    }
}
