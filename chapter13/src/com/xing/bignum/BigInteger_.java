package com.xing.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {


        //当编程中，需要处理很大的整数，long 不够用
        //可以使用BigInteger的类来搞定
//        long l = 23333333335L;
//        System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("23333333333333333333333333333333333");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        //老韩解读
        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        //2. 可以创建一个要操作的 BigInteger 然后进行相应的操作
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);

        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);//除

    }
}
