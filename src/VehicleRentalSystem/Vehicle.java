package VehicleRentalSystem;
// Abstract class vehicle
public abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private double rentalRate;
    // Parameterized constructor
    public Vehicle(String vehicleNumber, String vehicleType, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    // Abstract method
    public abstract double calculateRentalCost(int days);
    // Method to display details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
