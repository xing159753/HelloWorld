package com.xing.list_;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("linkedList=" + linkedList);

        //演示一个删除节点
        linkedList.remove();//这里默认删除的是第一个节点
        //linkedList.remove(2);

        System.out.println("linkedList=" + linkedList);

        //修改某个节点
        linkedList.set(1,999);
        System.out.println("linkedList=" + linkedList);

        //得到某个节点对象
        //get(1) 是得到 双向链表的第二个对象
        Object o = linkedList.get(1);
        System.out.println(o);//999

        //因为linkedList是实现了List接口，遍历方式
        System.out.println("======LinkedList遍历迭代器======");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }

        System.out.println("========LinkedList遍历迭代器增强for=========");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("========LinkedList遍历普通for=========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //老韩源码阅读：
        /*
        1. LinkedList linkedList = new LinkedList();
        public LinkedList() {}
        2. 这时 linkedList 的属性 first = null last = null
        3. 执行
        public boolean add(E e) {
        LinkLast(e);
        return true;
        }
        4. 将新的节点，加入到双向链表的最后
        void LinkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
        first = newNode;
        else
            l.next = newNode;
            size++;
            modCount++;
         */

        /*
        老韩解读源码  linkedList.remove();//这里默认删除的是第一个节点
        1. 执行removeFirst
        public E remove() {
        return removeFirst();
        }
        2. 执行
        public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
        throw new NoSuchElementExciption();
        return unLinkedFirst(f);
        }
        3. 执行 unlinkFirst , 将f指向的双向链表的第一个节点拿掉
        private E unlinkFirst(Node<E> f) {
        //assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null;//help GC
        first = next;
        if (next == null)
        last = null;
        size--;
        modCount++;
        return element;
        }
         */
    }
}
