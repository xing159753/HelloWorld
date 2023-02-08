package com.xing.stringbuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {

        //构造器的使用
        StringBuffer stringBuffer = new StringBuffer();
        //1. 创建一个大小为16的 char[] ，用于存放字符内容

        //2. 通过构造器指定char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3. 通过给一个String 创建 StringBuffer ,char[]大小就是 str.length() + 16
        StringBuffer hello = new StringBuffer("hello");

    }
}
