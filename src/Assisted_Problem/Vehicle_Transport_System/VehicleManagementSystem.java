package Assisted_Problem.Vehicle_Transport_System;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create object of class
        Vehicle vehicle = new Vehicle(120, "Both petrol and diesel");

        Vehicle car = new Car(240, "Petrol", "TATA", 4);

        Vehicle truck = new Truck(220, "Diesel", "Mahindra", 4000);

        Vehicle motorcycle = new Motorcycle(140, "Petrol", "Honda", 2025);
        // Array vehicle
        Vehicle[] vehicles = {vehicle, car, truck, motorcycle};
        // Call the methods of the class by objects stored in the array
        for(Vehicle object:vehicles) {
            object.displayInfo();
        }
    }
}
