package com.xing.android.loops.a1;

import java.util.ArrayList;

public class CalculateTotal {

    public static void main(String[] args) {

        ArrayList<Double> expense = new ArrayList<Double>();
        expense.add(74.46);
        expense.add(63.99);
        expense.add(10.57);
        expense.add(81.37);

        double total = 0;

        //Iterate over expense
        for (int i = 0; i < expense.size(); i++) {
             total += expense.get(i);
        }

        System.out.println(total);
    }
}
