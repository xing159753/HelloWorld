package com.xing.abstract_;

public class AA extends Template{


    //计算任务
    //1+....+10000
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 100000; i++) {
            num += i;
        }

    }
//    public void job2() {
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 1; i <= 100000; i++) {
//            num += i;
//        }
//
//        //结束时间
//        long end = System.currentTimeMillis();
//        System.out.println("AA执行时间 " + (end - start));
//    }
}
