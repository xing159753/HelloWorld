package com.xing.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double 不够用
        //可以是BigDecimal
//        double d = 1999.2222222229d;
//        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("8989.88888888888888888888888888");
        BigDecimal bigDecimal1 = new BigDecimal("3");
        System.out.println(bigDecimal);

        //老韩解读：
        //1. 如果对 BigDecimal 进行运算，比如加减乘除，需要使用对应方法
        //2. 创建一个需要操作的BigDecimal 然后调用相应的方法即可

        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //System.out.println(bigDecimal.divide(bigDecimal1));//可能抛出异常ArithmeticException
        //在调用divide 方法时，指定精度即可  BigDecimal.ROUND_CEILING
        //如果有无线循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));

    }
}
