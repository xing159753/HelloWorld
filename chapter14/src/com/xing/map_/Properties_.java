package com.xing.map_;

import java.util.Properties;

@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {

        //老韩解读：
        //1. Properties 继承 Hashtable
        //2. 可以通过 k-v存放数据，当然key和value 不能为null
        //增加
        Properties properties = new Properties();
        //properties.put(null,"abc");//抛出 空指针异常
        //properties.put("abc", null);//抛出 空指针异常
        properties.put("johb", 100);//k-v
        properties.put(null, 100);
        properties.put("john", null);
        properties.put("lucy", 100);
        properties.put("lic",100);
        properties.put("lic", 88);//如果有相同的key value被替换

        System.out.println("properties="+properties);

        //通过k 获取对应的值
        System.out.println(properties.get("lic"));//88

        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //修改
        properties.put("john","约翰");
        System.out.println("properties=" + properties);
    }
}
