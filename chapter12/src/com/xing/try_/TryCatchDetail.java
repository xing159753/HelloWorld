package com.xing.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        //ctrl + alt + t
        //如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
        //如果异常没有发生，则顺序执行try的代码块，b不会进入到catch
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续");
    }
}
