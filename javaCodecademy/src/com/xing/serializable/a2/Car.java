package com.xing.serializable.a2;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);
    }
}
