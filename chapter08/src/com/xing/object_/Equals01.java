package com.xing.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);
        B obj = a;
        System.out.println(obj == c);
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等
        //equals 方法 ，源代码怎么查看
        //把光标放在equals方法 ctrl + b
        "hello".equals("abc");
        //看看Object类的 equals
        //即object 的equals 方法默认是比较对象地址是否相同
        //也就是判断两个对象是不是同一个对象
       // Object
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
        String str1 = new String("hspedu");
        String str2 = new String("hspdeu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
class B {

}
class A extends B{

}