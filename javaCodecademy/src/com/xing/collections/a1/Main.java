package com.xing.collections.a1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("!");

        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
