package com.codecool.taxicompany;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SelfDriving extends Car {

    private boolean isOutOfOrder;
    private List<SelfDriving> selfDrivingList;
    private Supplier<Stream<SelfDriving>> selfDrivingDiscovery;


    public SelfDriving() {
        super();
        this.isOutOfOrder = false;
    }



    public void setOutOfOrder(boolean outOfOrder) {
        isOutOfOrder = outOfOrder;
    }

    public void setSelfDrivingCars(List<SelfDriving> selfDrivingCars) {
        this.selfDrivingList = selfDrivingCars;
    }

    public void registerDiscovery(Supplier<Stream<SelfDriving>> selfDrivingDiscovery) {
        this.selfDrivingDiscovery = selfDrivingDiscovery;
    }

    @Override
    public void calculateNumOfPassengers() {

    }

}
