package com.xing.stringbuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {
        //1 StringBuilder 继承 AbstractStringBuilder 类
        //2. 实现了 Serializable ,说明StringBuilder对象是可以串行化的 对象可以网络传输，可以保持到文件
        //3. StringBuilder 是 final 类  ，不能被继承
        //4 StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的 char[] value;
        // 因此，字符序列是堆中
        //5. StringBuilder 的方法， 没有做互斥的处理，即没有synchronized 关键字，因此单线程的情况下使用
        StringBuilder stringBuilder = new StringBuilder();

    }
}
