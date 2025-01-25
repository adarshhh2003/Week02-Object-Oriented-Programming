package Hybrid_Inheritance.Vehicle_Management_System;

// Test the implementation
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(200, "Toyota Corolla", 50);

        // Display roles and information
        ev.displayInfo();
        ev.displayRole();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.displayRole();
        pv.refuel();
    }
}