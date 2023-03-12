package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(abc(123(";
        //匹配 ( -> \\(
        //匹配 . -> \\.
        //String regStr = "\\(";
        //String regStr = "\\d\\d\\d";
        String regStr = "\\d\\d{3}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }

    }
}
