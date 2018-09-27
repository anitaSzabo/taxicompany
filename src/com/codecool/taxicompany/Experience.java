package com.codecool.taxicompany;

import java.util.Random;

public enum Experience {
    
    BEGINNER(15),
    ADVANCED(25),
    PROFESSIONAL(40);

    protected int numOfPassengers;
    private static Random random = new Random();
    private static int size = Experience.values().length;

    Experience(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public static Experience getRandomExperience() {
        return Experience.values()[random.nextInt(size)];
    }

}
