package RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Create vehicles
        Car car = new Car("C001", "Alice", 15.0);
        car.updateLocation("Downtown");

        Bike bike = new Bike("B001", "Bob", 8.0);
        bike.updateLocation("City Center");

        Auto auto = new Auto("A001", "Charlie", 10.0);
        auto.updateLocation("Suburbs");

        // Add vehicles to the list
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Process and display vehicle details
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            System.out.println();
        }
    }
}