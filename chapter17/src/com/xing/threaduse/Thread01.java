package com.xing.threaduse;

//演示通过继承Thread类创建线程
public class Thread01 {
    public static void main(String[] args) {

        //床建Cat对象，可以当做线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //说明：当main线程启动一个字线程 Thread-0,主线程不会阻塞
    }
}
//老韩说明
//1. 当一个类继承了Thread类，该类就可以当做线程使用
//2. 我们会重写run方法，写上自己的业务代码
//3. run Thread 类实现了 Runnable 接口的run方法
/*
        @Override
        public void run() {
        if (target != null) {
        target.run();
        }
        }
 */
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        while (true) {


        //该线程每隔一秒，在控制台输出 “喵喵，我是小猫咪”
        System.out.println("喵喵，我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
        //让该线程休眠1秒 ctrl + alt + t
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (times == 8) {
            break;//当times到80，退出while,这时线程也就退出...
        }
        }
    }
}

