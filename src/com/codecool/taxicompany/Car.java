package com.codecool.taxicompany;


public abstract class Car {

    private int id;
    private static int idCounter = 0;
    int cost;
    protected int passengersPerWeek;

    public abstract void calculateNumOfPassengers();

    Car(int cost) {
        this.id = idCounter++;
        this.cost = cost;
    }


}

