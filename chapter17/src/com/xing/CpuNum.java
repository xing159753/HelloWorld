package com.xing;

public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cup数量/核心数
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前有cpu个数=" + cpuNums);
    }
}
