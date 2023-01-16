package com.xing.object_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "hspedu";
        Person1 p2 = new Person1();
        p2.name = "hspedu";
        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));
        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }

}
class Person1 {
    public String name;
}
