package VehicleRentalSystem;
// Class truck extends vehicle and implements insurable
public class Truck extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 0.1;
    private String insurancePolicyNumber;
    // Parameterized constructor
    public Truck(String vehicleNumber, String vehicleType, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return INSURANCE_RATE * getRentalRate();
    }

    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
