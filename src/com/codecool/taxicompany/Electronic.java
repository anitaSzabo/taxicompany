package com.codecool.taxicompany;

public class Electronic extends Car {

    private Driver driver;

    public Electronic(Driver driver) {
        super(400);
        this.driver = driver;
        //this.cost = 400;
    }

    @Override
    public void calculateNumOfPassengers() {

    }

}
