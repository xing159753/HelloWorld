package com.xing.jdbc.a1;

public class Customer {
    public Integer ID;
    public String firstName;
    public String lastName;
    public String email;
    public String cellNumber;

    public Customer(Integer ID, String firstName, String lastName, String email, String cellNumber) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellNumber = cellNumber;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "ID = " + ID +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", email = '" + email + '\'' +
                ", cellNumber = '" + cellNumber + '\'' +
                '}';
    }
}
