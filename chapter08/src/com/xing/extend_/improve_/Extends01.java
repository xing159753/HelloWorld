package com.xing.extend_.improve_;

import com.xing.extend_.Graduate;
import com.xing.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.xing.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明~~";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();
        System.out.println("=========================");
        com.xing.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~~";
        graduate.age = 27;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
