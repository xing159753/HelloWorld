package com.xing.annotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {

    //1. 当我们不希望看到这些警告的时候，可以使用 SuppressWarnings注解来抑制警告信息
    //2. 在{""}中 可以写入你希望抑制(不显示) 警告信息
    //4. 关于 SuppressWarnings 作用范围是和你放置的范围有关
    // 比如 @SuppressWarnings放置在 main 方法，抑制警告范围就是main
    // 通常可以放在具体的语句，方法 ，类
    // kan看看 @SuppressWarnings原码
    // 1. 放置的位置就是 TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
    //2. 该注解类又数组  String[] value(); 设置一个数组比如 {"rawtapes","unchecked","unused"}
    /*
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {

    String[] value();
    }
     */
    @SuppressWarnings({"rawtapes","unchecked","unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        int i;
        System.out.println(list.get(1));

    }
    public void f1() {
        @SuppressWarnings({"raetypes"})
        List list = new ArrayList();

        list.add("jack");
        list.add("tom");
        list.add("marry");
        int i;
        System.out.println(list.get(1));
    }
}
