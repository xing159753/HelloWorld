package com.xing.math_;

public class MathMethod {
    public static void main(String[] args) {
        //看看Math的常用方法 静态方法
        //1. abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9
        //2. pow 求幂
        double pow = Math.pow(2, 4);//2的4次方
        System.out.println(pow);//16
        //3. ceil 向上取整，返回 >= 改参数的最小整数 转成double
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);//-3
        //4. floor向下取整，返回 <= 改参数的最大整数
        double floor = Math.floor(-4.999);
        System.out.println(floor);//-5.0
        //5. round 四舍五入 Math.floor(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);
        //6. sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);//3.0
        //7. random 求随机数
        // random 返回的是 0-1 之间的一个随机小数
        //思考 请写出获取 a - b 之间的一个随机整数，a,b均为整数？ 比如a = 2 b = 7;
        //即返回一个数 x   2 <= x <= 7
        //Math.random() * (b - a) 返回的就是 0  <= 数 <= b-a
        //1. (int)(a) <= x <= (int)(a + Math.random() * (b - a + 1))
        //2. 使用具体的数给小伙伴介绍 a = 2 b = 7
        //(int)(a + Math.random() * (b-a+1) ) = (int)(2 + Math.random() * 6)
        //Math.random() * 6 返回的是 0 <= x < 6 小数
        // 2 + Math.random() * 6 返回的就是 2 <= x < 8 小数
        //(int)(2 + Math.random() * 6) = 2 <= x <= 7
        // 公式就是 (int)(a + Math.random() * (b - a + 1))
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2 + Math.random() * (7 - 2 + 1)));
        }

        //max min 返回最大值和最小值
        int min = Math.min(1,9);
        int max = Math.max(45,90);
        System.out.println("min=" + min);
        System.out.println("max=" + max);

    }
}
