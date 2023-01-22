package com.xing.debug_;

//debug对象创建的过程，加深对调试的理解
public class DeBugExercise {
    public static void main(String[] args) {
//创建对象的流程 加载我们的Person 类信息（2）初始化 2.1默认初始化，2.2显示初始化2.3 构造器初始化
        //3 返回对象的地址
        Person jack = new Person("jack", 20);
        System.out.println(jack);
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
