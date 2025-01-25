package Assisted_Problem.Vehicle_Transport_System;

// Class car extends vehicle class
public class Car extends Vehicle {
    private String carCompany;
    private int seatCapacity;
    // Parameterized constructor
    public Car(int maxSpeed, String fuelType, String carCompany, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.carCompany = carCompany;
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Company: " + carCompany);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
