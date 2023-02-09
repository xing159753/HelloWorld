package com.xing.set_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();


        //说明
        //1. 在执行add方法后，会返回一个boolean值
        //2. 如果添加成功，返回true 否则返回 false
        //3. 可以通过 remove 指定删除哪个对象
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        set.remove("john");
        System.out.println("set=" + set);

        //
        set = new HashSet();
        System.out.println("set=" + set);//0
        //4. HashSet 不能添加相同的元素\数据
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        set.add(new Dog("tom"));//ok
        set.add(new Dog("tom"));//ok
        System.out.println("set=" + set);

        //在加深一下，经典的面试题
        //看源码 做分析 留悬念
        //去看他的源码 及到底发生了什么  底层机制
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//? 加入不了
        System.out.println("set=" + set);
    }
}
class Dog {//定义了Dog类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}