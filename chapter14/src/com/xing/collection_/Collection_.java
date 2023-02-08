package com.xing.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        //老韩解读：
        //1. 集合主要是两组(单列集合，双列集合)
        //2. Collection接口有两个重要的子接口 List Set,他们的实现子类都是单列集合
        //3. Map 接口的实现子类是 双列集合存放的 K - V
        //4. 把老师梳理的两张图记住
        //Collection
        //Map
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
    }
}
