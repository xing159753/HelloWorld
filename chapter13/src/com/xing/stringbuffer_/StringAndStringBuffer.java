package com.xing.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        //看 String -> StringBuffer
        String str = "hello tom";
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式一： 使用构造器
        // 返回的才是StringBuffer对象，对str本身没影响
        StringBuffer stringBuffer1 = new StringBuffer();
        //方式二： 使用的是 append方法
        stringBuffer1 = stringBuffer1.append(str);

        //看 String -> StringBuffer
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        // 使用StringBuffer提供的 toString方法
        String s = stringBuffer2.toString();
        //使用构造器来搞定
        String s1 = new String(stringBuffer2);

    }
}
