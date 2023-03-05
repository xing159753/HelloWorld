package com.xing.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//演示通过反射调用方法
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //1. 得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.xing.reflection.Boss");
        //2. 创建对象
        Object o = bossCls.newInstance();
        //3. 调用public 的hi 方法
        //Method hi = bossCls.getMethod("hi",String.class);//ok
        //3.1 得到hi方法对象
        Method hi = bossCls.getDeclaredMethod("hi",String.class);//ok
        //3.2 调用
        hi.invoke(o,"韩顺平教育");

        //4. 调用private static 方法
        //4.1 得到say方法对象
        Method say = bossCls.getDeclaredMethod("say",int.class, String.class, char.class);
        //4.2 因为say方法时private,所以需要爆破，原理和前面讲的构造器属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"张三",'男'));;
        //4.3 因为say方法是static的，还可以这样调用,可以传入null
        System.out.println(say.invoke(null,100,"张三",'男'));;

        //5. 在反射中，如果方法有返回值，统一返回Object,但一致是它运行类型和方法定义的返回类型
        Object reVal = say.invoke(null, 300, "王五", '男');
        System.out.println("reVal 的运行类型=" + reVal.getClass());//String


    }
}
class Boss {//类
    public int age;
    private static String name;
    public Boss() {//构造器

    }
    private static String say(int n,String s,char c) {//静态方法
        return n + " " + s + " " + c;
    }
    public void hi(String s) {//普通public方法
        System.out.println("hi" + s);
    }
}
