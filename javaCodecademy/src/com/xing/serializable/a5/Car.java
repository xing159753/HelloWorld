package com.xing.serializable.a5;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.io.*;

public class Car implements Serializable {
    private String make;
    private int year;
    private Engine engine;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
        //this.engine = new Engine(2.4, 6);
    }

    public String toString() {
        return String .format("Car make is: %s, Car year is: %d, %s",this.make, this.year, this.engine);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - " + toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);
    }
}
