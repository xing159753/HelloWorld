package com.xing.transformation;

import java.io.*;

//演示 OutputSteamWriter 使用
//把FileOutputStream 字节流，转成字符流 OutputSteamWriter
//指定处理的编码gdk/utf-8/utf8
public class OutputSteamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hsp.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("按照" + charSet + "保存文件成功");

        //PrintStream
       // PrintWriter


    }
}
