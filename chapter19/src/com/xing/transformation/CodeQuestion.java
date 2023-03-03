package com.xing.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//看一个中文乱码问题
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取e:\\a.txt 文件程序
        //思路
//1. 创建字符输入流 BufferedReader [处理流]
        //2. 使用BufferedReader 对象读取a.txt
        //3. 默认情况下，读取问价是按照 utf-8 编码

        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读取到的内容：" + s);
        br.close();

        //InputStreamReader
        //OutputStreamWriter

    }
}
