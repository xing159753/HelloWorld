//package com.xing.responding.a6;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class SuperHero {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String superPower;
//
//    protected SuperHero() {}
//
//    public SuperHero(String firstName, String lastName, String superPower) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.superPower = superPower;
//    }
//
//    @Override
//    public String toString() {
//        return.format(
//                "Super Hero[id=%d, firstName='%s, lastName='%s', superPower='%s']",
//                id,firstName, lastName, superPower);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSuperPower() {
//        return superPower;
//    }
//}
