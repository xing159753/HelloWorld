package com.xing.mergesort.a1;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] inputArray = {3};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(inputArray)));
    }
}
