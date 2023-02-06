package com.xing.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //1. num1 / num2 ----> 10 / 0
        //2. 当执行到 num1 / num2 时 因为 num2 = 0; 程序就会出现抛出异常 ArithmeticException
        //3. 当抛出异常后，程序就退出了，下面的代码就不在执行
        //4. 不应该出现了一个不算致命的问题，就导致整个系统崩溃
        //5. java设计者提供了一个叫 异常处理机制来解决该问题
        //int res = num1 / num2;
        //如果程序员，认为一段代码可能出现异常  可以使用try - catch 异常处理机制来解决
        //从而保证程序的健壮性

        //将改代码块选中 快捷键 ctrl + alt + t 选中 try - catch
        //如果进行异常处理，那么即使出现了异常，程序可以继续执行
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("出现异常的原因=" + e.getMessage());

        }

        System.out.println("程序继续运行");
    }
}
