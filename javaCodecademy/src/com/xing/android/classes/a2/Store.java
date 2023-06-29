package com.xing.android.classes.a2;

public class Store {
    // new method : constructor!
    public Store() {
        System.out.println("I am inside the constructor method.");
    }

    //main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");
        Store lemonadeStand = new Store();
        // create the instance below
        System.out.println(lemonadeStand);
        // print the instance below
        System.out.println(lemonadeStand);

    }
}
