package com.xing.homework;

public class Homework01 {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("jack",10,"JavaEE工程师");
        people[1] = new Person("tom",50,"大数据工程师");
        people[2] = new Person("mary",30,"PHP工程师");
        //输出当前的对象数组
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        
        //使用冒泡排序
        Person tmp = null;//临时变量，用于交换
        for (int i = 0; i < people.length - 1; i++) {//外层循环
            for (int j = 0; j < people.length - 1 - i; j++) {//内层循环
                //并按照age 从大到小排序，如果前面人的age < 后面人的年龄，就交换
                //要求按照名字的长度从小到大
//                if(people[i].getName().length() > people[i + 1].getName().length()) {
//
//                }
                if(people[i].getAge() < people[i + 1].getAge()) {

                    tmp = people[i];
                    people[i] = people[i+ 1];
                    people[i + 1] = tmp;
                }
                
            }

        }
        System.out.println("排序后的效果");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//默认对象的.toString()
        }

    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
