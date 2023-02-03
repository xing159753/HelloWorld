package com.xing.abstract_;

public class BB extends Template{


    public void job() {//这里也去，重写了Template的job方法

        //得到开始的时间
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 1; i <= 1000; i++) {
            num *= i;
        }

        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("BB执行时间 " + (end - start));
    }
}
