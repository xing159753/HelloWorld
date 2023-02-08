package com.xing.string_;

public class StringMethod01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        //2. equalsIgnoreCase 忽略大小写的判断内容是否相等
        String username = "john";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
        //3. length 获取字符的个数，字符串的长度
        System.out.println("韩顺平".length());
        //4. indexOf 获取字符串在字符对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);

        //5. lastIndexOf获取字符在字符串最后一次出现的索引，索引从0开始，如果找不到，返回-1
        s1 = "wer@terwe@g";
        index = s1.lastIndexOf('@');
        System.out.println(index);

        //6. substring 截取指定范围的子串
        String name = "hello,张三";
        System.out.println(name.substring(6));//截取后面的字符
        System.out.println(name.substring(0,5));//从索引0开始截取 截取5个字符
    }
}
