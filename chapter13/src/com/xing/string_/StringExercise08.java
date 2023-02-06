package com.xing.string_;

public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";//创建a对象
        String b = "abc"; //创建b 对象
        //1. 先创建一个 StringBuilder sb = StringBuilder()
        //2. 执行 sb.append("hello");
        //3. sb.append("abc")
        String c = a + b; //创建了几个对象？画出内存图
        String d = "helloabc";
        System.out.println(c == d);//真还是假 false
        String e = "hello" + "abc";//直接看池 e指向常量池
        System.out.println(d == e);//真还是假 true
    }
}
