package Assisted_Problem.Vehicle_Transport_System;

public class Motorcycle extends Vehicle {
    private String motorcycleCompany;
    private int model;

    public Motorcycle(int maxSpeed, String fuelType, String motorcycleCompany, int model) {
        super(maxSpeed, fuelType);
        this.motorcycleCompany = motorcycleCompany;
        this.model = model;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Company: " + motorcycleCompany);
        System.out.println("Model: " + model);
    }
}
