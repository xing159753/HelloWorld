package com.xing.arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90};
        //遍历数组
//        for (int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }
        //直接使用Arrays.toString方法，显示数组
        System.out.println(Arrays.toString(integers));

        //演示sort方法的使用
        Integer arr[] = {1, -1, 7, 0, 89};
        //进行排序
        //1. 可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
        //2. 因为数组是引用类型，所以通过sort排序后，会直接影响到实参 arr
        //3. sort重载的，也可以通过传入下一个接口 Comparator 实现定制排序
        //4. 调用 定制排序时，传入两个参数 01  排序的数组arr
        // 02 实现了Comparator接口的匿名内部类，要求实现 compare方法
        //5. 先演示效果，在解释
        //6. 这里体现了接口编程的方式，看看源码就明白了
        // 源码分析
        //01 Arrays.sort(arr, new Comparator()
        //02 到最终 TimeSort类的 private static <T> void binarySort(T[] a, int lo, int hi,
        //                                           Comparator<? super T> c)()
        //03 执行到 binarySort方法的代码  ，会根据动态绑定机制 c.compare()执行我们传入的
        //     匿名内部类 compare()
        /*
                    while (left < right) {
                    int mid = (left + right) >>> 1;
                    if (c.comparator(pivot,a[mid]) < 0)
                                  right = mid;
                              else
                                    left = mid + 1;
                             }
         */
        /*
        new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        }

        05 public int compare(Object o1, Object o2) 返回的值>0 还是 < 0
        会影响排序结果，这就充分体现了接口编程 + 动态绑定 + 匿名内部类的综合使用
        将来的底层框架和源码的使用方式，会非常常见
         */

        //Arrays.sort(arr); //默认排序方法
        //定制排序
        Arrays.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("=====排序后=====");
        System.out.println(Arrays.toString(arr));
    }
}
