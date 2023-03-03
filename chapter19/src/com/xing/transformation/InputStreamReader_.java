package com.xing.transformation;

import java.io.*;

//演示使用InputStreamReader转化流解决中文乱码问题
//将字节流 FileInputStream 转换成字符流 InputStreamReader,指定编码 gdk/utf-8
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        //解读
        //1.把 new FileInputStream 转成  InputStreamReader
        //2. 指定编码 gdk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gdk");
        //3. 把 InputStreamReader传入BufferedReader
        //BufferedReader br = new BufferedReader(isr);

        //将2和3合在一起
        BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
                //4. 读取
        String s = br.readLine();
        System.out.println("读取内容=" + s);
        //5. 关闭外层流
        br.close();

    }
}
