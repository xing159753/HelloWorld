package com.xing.map_;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("邓超","孙俪");//
        map.put("王宝强","马蓉");//
        map.put("马蓉","王宝强");//
        map.put("刘令博",null);//
        map.put("null","刘亦菲");//
        map.put("鹿晗","关晓彤");//

        //第一组: 先取出所有的key,通过key取出对应的Value
        Set keyset = map.keySet();
        //1. 增强for
        System.out.println("----------第一种方式---------");
        for(Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        //2. 跌代器
        System.out.println("----------第二种方式---------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的value取出
        Collection values = map.values();
        //这里可以使用所有的Collections使用的遍历方法
        //1. 增强for
        System.out.println("---------取出所有的value, 增强for---------");
        for (Object value : values) {
            System.out.println(value);
        }
        //迭代器
        System.out.println("---------取出所有的value, 迭代器---------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        //第三组：通过EntrySet 来获取k-v
        Set entryset = map.entrySet();// EntrySet<Map.Entry<K,V>>
        //1. 增强for
        System.out.println("---------使用EntrySet的for增强(第3种)---------");
        for (Object entry : entryset) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //2. 迭代器
        System.out.println("---------使用EntrySet的迭代器(第4种)---------");
        Iterator iterator3 = entryset.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            //System.out.println(next.getClass());//HashMap$Node  实现  Map.Entry(getKey, getValue)
            //向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }



    }
}
