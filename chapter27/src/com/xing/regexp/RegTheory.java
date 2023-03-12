package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 分析java的正则表达式的底层实现(重要)
 */
public class RegTheory {
    public static void main(String[] args) {
        String content = "引入子网掩码(NetMask)，从逻辑上把一个大网络划分成" +
                "一些小网络。子网掩码是由一系列的1和0构成，通过将其同IP地址做“" +
                "与”运算来指出一个IP地址的网络号是什么。对于传统IP地址分类来说" +
                "，A类地址的子网掩码是255.0.0.0；B类地址的子网掩码是255.255.0.0；" +
                "C类地址的子网掩码是255.255.255.0。例如，如果要将一个B类网络166.11" +
                "1.0.0划分为多个C类子网来用的话，只要将其子网掩码设置为255.255.255." +
                "0即可，这样166.111.1.1和166.111.2.1就分属于不同的网络了。像这样，通" +
                "过较长的子网掩码将一个网络划分为多个网络的方法就叫做划分子网(Subnetting)";

        //目标：匹配所有四个数字
        //说明
        //1. \\d表示一个任意的数字
        String regStr = "\\d\\d\\d\\d";
        //2. 创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
        //3. 创建匹配器
        //说明:创建匹配器matcher,按照 正则表达式的规则，去匹配 content字符串
        Matcher matcher = pattern.matcher(content);

        //4. 开始匹配
        /**
         *
         *
         * matcher.find() 完成的任务
         * 什么是分组，比如(\d\d)(\d\d),正则表达式中有() 表示分组，第1个()表示第1组，第2个()表示第2组，
         * 1. 根据指定的规则，定位满足规则的子字符串(比如(19)(98)
         * 2. 找到后，将子字符串的开始的索引记录到matcher对象的属性 int[] groups;
         *    groups[0] = 0,把该子字符串的结束的索引+1的值记录到groups[1] = 4
         *    2.2 记录一组()匹配到的字符串groups[1] = ? groups[2] = ?
         *    2.3 记录2组()匹配到的字符串 groups[4] = 2 groups[5] = 4
         *    2.4 如果有更多分组
         * 3. 同时记录oldLast 的值为子字符串的结束的索引+1的值即4，即下次执行find时，就从4开始匹配
         *
         * matcher.group(0) 分析
         *public String group(int group) {
         *         if (first < 0)
         *             throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *             throw new IndexOutOfBoundsException("No group " + group);
         *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *             return null;
         *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *     }
         *
         *  1. 根据groups[0]=0 和groups[1]=4 的记录的位置，从content开始截取子字符串返回
         *  就是[0,4) 包含0但是不包含索引为4的位置
         *
         * 如果再次指向find方法，任然按上面分析来执行
         */
        while (matcher.find()) {
            //小结
            //1. 如果正则表达式有() 即分组
            //2. 取出匹配的字符串规则如下
            //3. group(0) 表示匹配到的子字符串
            //4. group(1) 表示匹配到的子字符串的第一组字串
            //5. group(2) 表示匹配到的子字符串的第2组字串
            //6. 但是分组的数不能越界。
            System.out.println("找到： " + matcher.group(0));
            System.out.println("第1组()匹配到的值= " + matcher.group(1));
            System.out.println("第2组()匹配到的值= " + matcher.group(2));

        }

    }

}
