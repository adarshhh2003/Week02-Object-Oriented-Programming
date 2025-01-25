package Hybrid_Inheritance.Vehicle_Management_System;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    public void displayRole() {
        System.out.println("Role: Petrol Vehicle");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}