package com.xing.regexp;

public class StringReg {
    public static void main(String[] args) {
        String content = "";

        //使用正则表达式方式将JDK1.3 和 JDK1.4 替换成JDK
        content = content.replaceAll("JDK1\\.3|JDK\\.4","JDK");
        System.out.println(content);

        //要求 验证一个手机号，要求必须是138 139 开头的
        content = "13688889999";
        if (content.matches("1(38|39)\\d{8}")) {
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }

        //要求按照 # 或者 - 或者 ~ 或者数字来分割
        System.out.println("========================");
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
