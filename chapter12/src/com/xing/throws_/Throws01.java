package com.xing.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
//    public void f1() {
//        //创建了一个文件流对象
//        //这里的异常是一个FileNotFoundException编译异常
//        //使用前面讲过的 try catch finally
//        //使用throws,抛出异常
//        try {
//            FileInputStream fis = new FileInputStream("d://aa.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//        }
//    }
    public void f1() throws FileNotFoundException , NullPointerException , ArithmeticException{//Exception
        //创建了一个文件流对象
        //这里的异常是一个FileNotFoundException编译异常
        //使用前面讲过的 try catch finally
        //使用throws,抛出异常,让调用f1方法的调用者(方法)处理
        //3. throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        //4. throws 关键字后也可以是 异常列表，即可以抛出多个异常

        FileInputStream fis = new FileInputStream("d://aa.txt");

    }
}
