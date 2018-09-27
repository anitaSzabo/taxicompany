package com.codecool.taxicompany;

import java.util.List;

public class Driver {

    private int phoneNumber;
    private static int phoneNumberCounter = 00001;
    private String name;
    private int age;
    private int salary = 140;
    private List<Integer> phoneNumbersList;
    protected Experience experience;


    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumberCounter++;
        this.experience = Experience.getRandomExperience();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumbersList(List<Integer> phoneNumbersList) {
        this.phoneNumbersList = phoneNumbersList;
    }

    public String getName() {
        return name;
    }

    public Experience getExperience() {
        return experience;
    }
}
