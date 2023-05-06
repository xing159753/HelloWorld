package com.xing.collections.a4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(9);
        myInts.add(13);
        myInts.add(2);
        myInts.add(1);
        myInts.add(11);
        myInts.add(39);
        myInts.add(78);
        myInts.add(4);

        Deque<Integer> result = separateInts(myInts);
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static Deque<Integer> separateInts(List<Integer> integers) {
        Deque<Integer> separatedDeque = new ArrayDeque<>();

        for (Integer myInt : integers) {
            if (myInt % 2 == 0) {
                separatedDeque.addFirst(myInt);
            } else {
                separatedDeque.addLast(myInt);
            }
        }
        return separatedDeque;
    }
}
