package com.xing.collections.a2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(7);
        sortedSet.add(27);
        sortedSet.add(7);

        for (Integer element : sortedSet) {
            System.out.println(element);
        }
    }
}
