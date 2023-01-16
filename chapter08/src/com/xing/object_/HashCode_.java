package com.xing.object_;

import org.omg.CORBA.SetOverrideType;

public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa.hashcode()=" + aa.hashCode());
        System.out.println("aa2.hashcode()=" + aa2.hashCode());
        System.out.println("aa3.hashcode()=" + aa3.hashCode());
    }
}
class AA {}
