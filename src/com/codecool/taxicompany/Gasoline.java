package com.codecool.taxicompany;


public class Gasoline extends Car {

    private Driver driver;

    public Gasoline(Driver driver) {
        super();
        this.driver = driver;
        this.cost = 350;
    }

    private int maintananceCost;


    @Override
    public void calculateNumOfPassengers() {

    }

}
