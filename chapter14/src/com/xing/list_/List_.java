package com.xing.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List集合类中元素有序（即添加顺序和取出顺序一致），且可重复【案例】
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        System.out.println("list=" + list);
        //2. List集合中的每一个元素都有其对应的顺序索引，即支持索引
        //   索引是从0开始
        System.out.println(list.get(3));//hsp
    }
}





