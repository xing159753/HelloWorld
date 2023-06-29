package com.xing.android.debugging.a4;

public class Debug {

    public static void main(String[] args) {
        int width = 0;
        int length = 40;

        try {
            int radio = length / width;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
