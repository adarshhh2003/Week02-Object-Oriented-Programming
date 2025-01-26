package VehicleRentalSystem;
// Class Bike extends vehicle class
public class Bike extends Vehicle{

    public Bike(String vehicleNumber, String vehicleType, double rentalRate) {
        super(vehicleNumber, vehicleType, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
