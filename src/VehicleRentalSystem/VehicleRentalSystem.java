package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;
// Main class
public class VehicleRentalSystem {
    // Main method
    public static void main(String[] args) {
        // Arraylist to store objects of classes
        List<Vehicle> vehicleList = new ArrayList<>();
        // Create objects of classes
        Car car = new Car("C123", "Car", 1000.0, "POL123CAR");
        Bike bike = new Bike("B123", "Bike", 500.0);
        Truck truck = new Truck("T123", "Truck", 2000.0, "POL789TRUCK");
        // Add objects of class in the list
        vehicleList.add(car);
        vehicleList.add(bike);
        vehicleList.add(truck);
        // Call the methods and display the result
        for(Vehicle vehicle: vehicleList) {
            vehicle.displayDetails();
            int rentalDays = 5;
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental cost for " + rentalDays + "Days: " + rentalCost);

            if(vehicle instanceof Insurable) {
                System.out.println("Insurance Cost: " + ((Insurable)vehicle).calculateInsurance());
                System.out.println(((Insurable)vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
