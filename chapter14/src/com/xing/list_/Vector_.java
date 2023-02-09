package com.xing.list_;

import java.util.Vector;

@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        //无参构造器
        //有参数的构造
        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);

            //老韩解读源码：
            //1. new Vector() 底层
            /*
                       public Vector() {
                       this(10);
                       }
                       补充：如果是  Vector vector = new Vector(8);
                       走的方法是
                       public Vector(int initialCapacity) {
                       this(initialCapacity,0);
                       2. vector.add(i)
                       2.1 // 下面这个方法就添加数据到vector集合
                       public synchronized boolean add(E e) {
                       modCount++;
                       ensureCapacityHelper(elementCount + 1);
                       elementDate[elementCount++] = e;
                       return true;

                       2.2 //确定是否需要扩容 条件： minCapacity - elementData.length>0

                       //newCapacity = oldCapacity + ((capacityIncrement > 0)?
                       //                 capacityIncrement : oldCapacity;
                       //就是 扩容的两倍
                       private void ensureCapacityHelper(int minCapacity) {
                       //overflow-conscious code
                       if (minCapacity - elementData.length > 0)
                       grow(minCapacith);
                       2.3 //如果需要的数组大小 不够用，就扩容
                       private void grow(int minCapacity) {
                       //Overflow-conscious code
                       int oldCapacity = elementData.length;
                       int newCapacity = oldCapacity + ((capacityIncrement > 0)?
                                                         capacityIncrement : oldCapacity;
                       if (newCapacity - minCapacity < 0)
                       newCapacity = minCapacity;
                       if (newCapacity - MAX_ARRAY_SIZE > 0)
                       newCapacity = hugeCapacity(minCapacity);
                       elementData = Arrays.copyOf(elementData, newCapacity);
                       }

             */
        }
        vector.add(100);
        System.out.println("vector=" + vector);
    }
}
