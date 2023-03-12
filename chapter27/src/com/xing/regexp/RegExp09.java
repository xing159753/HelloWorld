package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 非贪婪匹配
 */
public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello11111111 ok";
        //String regStr = "\\d+";//默认是贪婪匹配
        String regStr = "\\d+?";//非贪婪匹配



        Pattern pattern = Pattern.compile(content);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
    }
}
