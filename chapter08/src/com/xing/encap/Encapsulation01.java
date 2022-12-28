package com.xing.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name = "jack";
        person.setName("jack6666666");
        person.setAge(30);
        person.setSalary(300000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        //如果我们自己使用构造器指定属性
        Person smith = new Person("smith", 200, 9999);
        System.out.println("=============smith的信息=============");
        System.out.println(smith.info());

    }
}
class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        //我们可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    //    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要（2-6）个字符，默认名字");
            this.name = "无名小子";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在 1 - 120");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info() {
        return "信息为 name = " + name + " age = " + age + " salary = " + salary;
    }
}
