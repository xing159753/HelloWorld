package com.xing.throws_;

public class ThrowsException {
    public static void main(String[] args) {

        try {
            ReturnExceptionDemo.methodA();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}
class ReturnExceptionDemo{
    static void methodA() {
        try{
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }
    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("用B方法的finally");
        }
    }
}