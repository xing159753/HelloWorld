package com.xing.set_;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class TestSet_ {
    public static void main(String[] args) {

        //老韩解读：
        //1. 当我们使用无参构造器，创建TreeSet时，仍然是无序的
        //2. 老师希望添加的元素，按照字符串的大小来排序
        //3. 使用TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        //  并指定排序规则
        //4. 简单看看源码

        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用String的compareTo方法进行字符串大小比较
                //如果老韩要求加入的元素，按照长度的大小排序
                //return ((String) o1).compareTo((String) o2);
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("tom");//3
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");//3


        System.out.println("treeSet=" + treeSet);

        //老韩解读：
        //1. 构造器把传入的比较器对象，赋给了 TreeSet的底层 TreeMap第属性
        /*

        public TreeMap(Comparator<? super K> compatator) {
                this.comparator = compatator;
            }
            2.再调用 treeSet.add("tom")在底层会执行到

            if (car != null) {//cpr 就是我们的匿名内部类(对象）
                do {
                    partent = t;
                    cmp = cpr.compare(Key, t.key);//动态绑定到我们的匿名内部类(对象）compare
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //如果相等，即返回0，这个key就没有加入
                        return t.setValue(value);
                    } while (t != null);
                }
         */
    }
}
