package com.codecool.taxicompany;

public class SimulateCompany {


    public static void main(String[] args) {
        Company company = new Company();
        company.createDrivers();
        company.createCars();
        company.simulateCompany();

    }


}
