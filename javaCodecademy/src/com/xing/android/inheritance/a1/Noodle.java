package com.xing.android.inheritance.a1;

public class Noodle {

    double lengthInCentimeters;
    String shape;
    String texture = "brittle";

    public void cook() {
         this.texture = "cooked";
    }

    public static void main(String[] args) {

        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);
    }
}
