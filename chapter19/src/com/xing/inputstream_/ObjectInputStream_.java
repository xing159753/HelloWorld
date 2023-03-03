package com.xing.inputstream_;

import com.xing.outputstream_.Dog;

import java.io.*;


public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件
        String filePath = "d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //老师解读
        //1. 读取反序列化的顺序需要和你保存数据(序列化)的顺序一致
        //2. 否则会出现异常

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        //dog的编译类型是 Object,dog的运行类型是 Dog
        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息=" + dog);//底层Object -> Dog

        //这里是特别重要的细节：
        //1. 如果我们希望调用Dog的方法，需要向下转型
        //2. 需要我们将Dog类的定义，拷贝到可以引用的位置
        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getName());//旺财

        //关闭流，关闭外层流即可 底层会关闭 FileInputStream 流
        ois.close();

    }
}
