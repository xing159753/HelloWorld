package com.xing.junittesting.a3;

public class Example {

    public Example() {

    }

    public int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
