package com.codecool.taxicompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private List<Car> cars = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Integer> phoneNumbers = new ArrayList<>();
    private List<SelfDriving> selfDrivingCars = new ArrayList<>();

    public void calculatePassengerAmount() {

    }

    public void createCars() {
        cars.add(new Gasoline(getRandomDriver()));
        cars.add(new Electronic(getRandomDriver()));
        registerSelfDriving(new SelfDriving());

    }

    private Driver getRandomDriver() {
        Random random = new Random();
        return drivers.get(random.nextInt(drivers.size()));
    }

    public void createDrivers() {
        registerNewDriver(new Driver("Sándor", 42));
        registerNewDriver(new Driver("József", 42));
        registerNewDriver(new Driver("Benedek", 42));
    }

    public void simulateCompany() {
        for (int i = 0; i < 52; i++) {
            simulateWeek();
        }

    }

    private void simulateWeek() {
        for(Car car: cars) {
            //System.out.println(car.getClass().getSimpleName() + " " + car.getDriver().getName() + " " + car.getDriver().getExperience());
        }
    }

    public void registerNewDriver(Driver driver) {
        drivers.add(driver);
        phoneNumbers.add(driver.getPhoneNumber());
        driver.setPhoneNumbersList(phoneNumbers);
    }

    public void registerSelfDriving(SelfDriving selfDriving) {
        cars.add(selfDriving);
        selfDrivingCars.add(selfDriving);
        selfDriving.setSelfDrivingCars(selfDrivingCars);
        maintanenceSelfDrivingCars();
        //selfDriving.registerDiscovery(() -> selfDrivingCars.stream().filter(d -> d!= selfDriving));
    }

    private void maintanenceSelfDrivingCars() {
        for (SelfDriving selfDriving: selfDrivingCars) {
            selfDriving.setOutOfOrder(true);
        }

    }
}

