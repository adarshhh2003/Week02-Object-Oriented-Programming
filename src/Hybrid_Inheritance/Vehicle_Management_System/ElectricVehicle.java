package Hybrid_Inheritance.Vehicle_Management_System;

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    public void displayRole() {
        System.out.println("Role: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}