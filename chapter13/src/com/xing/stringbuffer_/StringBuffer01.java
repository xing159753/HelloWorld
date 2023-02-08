package com.xing.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        //1. StringBuffer 的直接父类是 AbstractStringBuilder
        //2. StringBuffer 实现了Serializable,即StringBuffer的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性 char[] value 不是 final
        // 该 value 数组存放 字符串内容，引出在堆中的
        //4 .StringBuffer 是一个 final类，不能被继承
        //5. 因为StringBuffer 字符内容是存在 char[] value 所有在变化（增加、删除）
        // 不用每次都更换地址 即创建新对象，所以效率高与String


    }
}
