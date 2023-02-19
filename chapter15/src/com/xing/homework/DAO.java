package com.xing.homework;

import java.util.*;

//定义个泛型类 DAO<T>,在其中定义一个Map成员变量，Map的键为String 类型，值为T类型。
//        分别创建以下方法：
//        1. public void save(String id,T entity): 保存T类型的对象到Map成员变量中
//        2. public T get(String id): 从 map中获取id 对应的对象
//        3. public void update(String id,T entity): 替换map中key为id的内容，改为entity对象
//        4. public List<T> list(): 返回map中存放的所有T对象
//        5. public void delete(String id): 删除指定id对象
public class DAO<T> {//泛型类
    private Map<String,T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }
    public void update(String id,T entity) {
        map.put(id,entity);
    }
    //返回map中存放的所有T对象
    //遍历map[k-v],将map的所有value(T entity),封装到ArrayList返回即可
    public List<T> list() {
        //创建ArrayList
        List<T> list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (String key :keySet) {
            //map.get(key)返回就是User对象 -》 ArrayList
            list.add(map.get(key));//也可以直接使用本类的get(String id)

        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
    public void save(String id,T entity) {//把entity保存到map
        map.put(id,entity);

    }
}
