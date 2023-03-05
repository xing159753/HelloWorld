package com.xing.reflection;

import com.xing.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//测试反射调用的性能，和优化方案
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        //Filed
        //Method
        //Constructor
        m1();
        m2();
        m3();

    }
    //传统方法来调用hi

    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1 耗时=" + (end - start));

    }
    //发射机制调用方法
    public static void m2() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        Class cls = Class.forName("com.xing.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m2 耗时=" + (end - start));
    }
    //反射调用优化 + 关闭访问检查
    public static void m3() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        Class cls = Class.forName("com.xing.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m3 耗时=" + (end - start));
    }

}
