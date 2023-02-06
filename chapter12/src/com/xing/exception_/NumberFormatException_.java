package com.xing.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
      //  String name = "韩顺平教育";
        String name1 = "1234";
        //将String 转成int
        int num = Integer.parseInt(name1);//抛出NumberFormatException
        System.out.println(num);
    }
}
