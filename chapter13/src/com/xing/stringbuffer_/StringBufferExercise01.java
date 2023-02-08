package com.xing.stringbuffer_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;//ok
        StringBuffer sb = new StringBuffer();//ok
        sb.append(str);//需要源码，底层调用的是AbstractStringBuilder
        System.out.println(sb.length());//4
        System.out.println(sb); //null
        //下面的构造器，会抛出NullPointerException
        StringBuffer sb1 = new StringBuffer(str);//看底层源码 super(str.length() + 16);
        System.out.println(sb1);
    }
}
