package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp08 {
    public static void main(String[] args) {
        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

        //找到 韩顺平教育，韩顺平老师 韩顺平同学子字符串
        //上面的写法可以等价非捕获分组 注意不能 matcher.group(1)
        //String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        //String regStr = "韩顺平(?:教育|老师|同学)";


        //找到韩顺平这个关键字，但是要求只是查找韩顺平教育和韩顺平老师中包含有的韩顺平
        //下面的写法可以等价非捕获分组 注意不能 matcher.group(1)
       // String regStr = "韩顺平(?:教育|老师)";

        //找到 韩顺平 这个关键字，但是要求只是查找 不是 （韩顺平教育和韩顺平老师）中包含有的韩顺平
        String regStr = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
            System.out.println("找到" + matcher.group(1));
        }
    }
}
