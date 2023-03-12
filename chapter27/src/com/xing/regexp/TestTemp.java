package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTemp {
    public static void main(String[] args) {
        String content = "hello abc 1111";
        //String regStr = ".";//匹配除了\n的所有字符
        //String regStr = "[.]";//匹配.本身
        //String regStr = "\\.";//
        String regStr = "[?]";//



        Pattern pattern = Pattern.compile(content);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
    }
}
