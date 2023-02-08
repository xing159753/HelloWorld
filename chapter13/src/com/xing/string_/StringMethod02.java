package com.xing.string_;

public class StringMethod02 {
    public static void main(String[] args) {
        //1. toUpperCase 转成大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());//HELLO
        //2. toLowerCase
        System.out.println(s.toLowerCase());
        //3. concat拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);
        //4. replace 替换字符串中的字符
        s1 = "宝玉 and 薛宝钗 薛宝钗 薛宝钗";
        //在s1 中 将所有林黛玉换成薛宝钗
        s1 = s1.replace("林黛玉","薛宝钗");
        System.out.println(s1);
        //5. split 分割字符串 对于某些分割字符 我们需要转义 比如 | //等
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String[] split = poem.split("，");
        //String poem = "E:\\aaa\\bbb";
        //String[] split = poem.split("\\|");
        //String[] split = poem.split("\\\\");
        //String[] split = poem.split("\\\\");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6. toCharArray 转换成字符数组
         s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        //7. compareTo 比较两个字符串的大小，如果前者大，则返回正数，后者大返回负数，相等返回0
        // 1 如果长度相同，并且每个字符也相同，就返回0
        // 2 如果长度相同或者不同，但是在进行比较时，可以区分大小写
        /*
                    就返回if(c1 != c2) {
                    return c1 - c2;
                    }
            3 如果前面的字符都相同，就返回 str1.len -str.len

         */
        String a = "jchn";
        String b = "jack";
        System.out.println(a.compareTo(b));//返回值是 'c' - 'a' = 2 的值
        //8. format格式字符串
        /*
             占位符有：
             %s 字符串 %c 字符 %d 整型 %.2f 浮点型
         */
        String name = "john";
        int age = 10;
        double score = 98.3 / 3;
        char gender = '男';
        String info = "我的姓名是" +name + "年龄是" + age + ",成绩是" + score + "性别是"
                + gender + ".希望大家喜欢我";
        String info2 = String.format("我的姓名是%s年龄是%d,成绩是%.2f性别是%c.希望大家喜欢我!",name, age, score, gender);
        System.out.println(info);
        System.out.println(info2);
        String formatStr = "我的姓名是%s年龄是%d,成绩是%.2f性别是%c.希望大家喜欢我!";
        String info3 = String.format(formatStr, name, age, score, gender);
        //1 %s %c %d %.2f 称为占位符
        //2 这些占位符由后面变量来替换
        //3. %s 表示后面由字符串来替换 %d 整数 %.2f 小数 只会保留小数点后两位；

    }
}
