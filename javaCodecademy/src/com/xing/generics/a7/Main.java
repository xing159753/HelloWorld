package com.xing.generics.a7;

import com.xing.generics.a5.Bus;
import com.xing.generics.a5.SchoolPerson;
import com.xing.generics.a5.Student;

public class Main {
    public static void main(String[] args) {
        Bus<Student> studentBus = new Bus<>(new Student("Mike", "Math"));
        Bus<SchoolPerson> personBus = new Bus<>(new SchoolPerson("Jerry"));

        transferData(studentBus, personBus);
    }

    public static void transferData(Bus<? extends Student> src , Bus<? super SchoolPerson> dsc) {
        System.out.println("dsc bus rider before switch: ");
        dsc.printRider();
        Student studentInSrcBus = src.getRider();
        System.out.println("dsc bus rider after switch: ");
        dsc.setRider(studentInSrcBus);
        dsc.printRider();
    }
}
