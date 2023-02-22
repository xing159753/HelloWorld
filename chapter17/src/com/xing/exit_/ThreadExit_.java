package com.xing.exit_;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {

        T t1 = new T();
        t1.start();
        //如果希望main线程去控制t1 线程的终止，必须可以修改loop
        //让t1退出run方法，从而终止t1线程 -> 通知方式

        //让主体线程休眠 10 秒，在通知 t1线程退出

        Thread.sleep(10 * 1000);
        t1.setLoop(false);

    }
}
class T extends Thread {
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {

            try {
                Thread.sleep(50);//让当前线程休眠10ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中..." + (++count));
        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
