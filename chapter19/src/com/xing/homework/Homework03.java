package com.xing.homework;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 要编写一个dog.properties name = tom age = 5 color = red
         * 2. 编写Dog类(name,age,color)创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化，并输出
         * 3. 将创建的Dog 对象序列化文件e:\\dog.dat文件
         */
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";//Object -> String
        int age = Integer.parseInt(properties.get("age") + "");//Object -> int
        String color = properties.get("color") + "";//Object -> String

        Dog dog = new Dog(name, age, color);
        System.out.println("====dog对象信息====");

        System.out.println(dog);

        //将创建的Dog 对象序列化文件dog.dat文件
        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        //关闭流
        oos.close();
        System.out.println("dog对象，序列化完成");
    }
    //在编写一个方法，反序列化dog
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();

        System.out.println("========反序列化后 dog=======");
        System.out.println(dog);

    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
