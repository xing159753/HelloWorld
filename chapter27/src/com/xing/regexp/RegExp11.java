package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示正则表达式的使用
 */
public class RegExp11 {
    public static void main(String[] args) {

        String content = "";

        /**
         * 思路
         * 1. 先确定url的开始部分 https:// | http://
         * 2. 然后通过([\w-]+\.)+[\w-]+ 匹配www.bilibili.com
         * 3. /video/BV1fh411y7R8?from=sear匹配[\w-?=&/%.#]*)?$
         */
        String regStr = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";//注意： [. ? *]表示匹配就是.本身

        Pattern pattern = Pattern.compile(content);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
        //这里如果使用Pattern的matches 整体匹配 比较简介
        System.out.println(Pattern.matches(regStr,content));
    }
}
