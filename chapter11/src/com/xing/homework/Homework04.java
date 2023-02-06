package com.xing.homework;

public class Homework04 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        //匿名内部类是
        /*
        new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }同时也是一个对象
         */
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);//18.0
    }
}
//编写接口
interface ICalculate {
    //work方法 是完成计算，但是题目没有具体要求，所以自己设计
    //至于该方法完成怎样的计算，我们交给匿名内部类完成
    public double work(double n1,double n2) ;
}
class Cellphone {
    //当我们调用testWork方法时，直接传入一个实现了ICalculate接口的匿名内部类即可
    //g该匿名内部类，可灵活的实现work，完成不同的计算任务
    public void testWork(ICalculate iCalculate,double n1,double n2) {
        double result = iCalculate.work(n1, n2);
        System.out.println("计算后的结果是=" + result);

    }
}
