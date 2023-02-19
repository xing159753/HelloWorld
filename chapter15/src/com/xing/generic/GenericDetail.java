package com.xing.generic;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericDetail {
    public static void main(String[] args) {
        //1. 给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>();//ok
        //List<int> list2 = new ArrayList<int>();//false

        //2. 说明
        //因为E 指定了A类型，构造器传入了 new A()
        //在给泛型指定具体类型后，可以传入该类型或者其子类类型
        //ArrayList<A> all = new ArrayList<A>();
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();
        //3. 泛型的使用类型
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        //在实际开发中，我们往往简写
        //编译器会进行类型推断，老师使用下面写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();

        //4. 如果是这样写 泛型默认是Object
        ArrayList<Object> arrayList = new ArrayList<Object>();//等价 ArrayList<Object> arryalist = new ArrayList<>();
/*
        public boolean add(Object e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
}
 */
        Tiger tiger = new Tiger();
        /*
        class Tiger {//类
    Object e;
    public Tiger() {
    }
    public Tiger(Object e) {
        this.e = e;
    }
}
         */

    }
}
class Tiger<E> {//类
    E e;
    public Tiger() {

    }

    public Tiger(E e) {
        this.e = e;
    }
}
class A {}
class B extends A{}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(e.getClass());//运行类型
    }
}