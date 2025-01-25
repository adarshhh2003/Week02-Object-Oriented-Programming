package Assisted_Problem.Vehicle_Transport_System;

public class Truck extends Vehicle {
    private String truckCompany;
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, String truckCompany, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.truckCompany = truckCompany;
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck Company: " + truckCompany);
        System.out.println("Load Capacity: " + loadCapacity + " kg.");
    }
}
