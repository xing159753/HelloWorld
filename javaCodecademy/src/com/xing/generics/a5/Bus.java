package com.xing.generics.a5;

public class Bus<T extends SchoolPerson> {
    private T rider;

    public Bus(T rider) {
        this.rider = rider;
    }

    public void setRider(T rider) {
        this.rider = rider;
    }

    public T getRider() {
        return this.rider;
    }

    public void printRider() {
        System.out.println(rider.toString());
    }
}
