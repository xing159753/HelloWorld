package com.xing.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

//演示bufferedReader使用
public class BufferedReader_  {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\a.java";
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高
        //说明
        //1. bufferedReader.readLine() 是按行读取
        //2. 当返回null时，表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //关闭流，这里注意，字需要关闭 BufferedReader,因为底层会自动的其关闭 节点流
        //FileReader,
        bufferedReader.close();
    }
}
