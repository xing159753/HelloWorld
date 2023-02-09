package com.xing.list_;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {

        //ArrayList 是线程不安全的，可以看源码 没有synchronized

        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("hsp");
        System.out.println(arrayList);
    }
}
