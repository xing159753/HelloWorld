package com.xing.serializable.a6;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.io.*;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;
    private Engine engine;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
        //this.engine = new Engine(2.4,6);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.writeObject(this.make);
        stream.writeInt(this.year);
       // stream.writeDouble(this.engine.getLiters());
       // stream.writeInt(this.engine.getCylinders());
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        this.make = (String) stream.readObject();
        this.year = (int) stream.readInt();
        double liters = (double) stream.readDouble();
        int cylinders = (int) stream.readInt();
        //this.engine = new Engine(liters,cylinders);
    }

    public String toString() {
        return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
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
