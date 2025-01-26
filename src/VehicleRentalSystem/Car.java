package VehicleRentalSystem;
// Class Car extends vehicle class and implements insurable interface
public class Car extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 0.05;
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String vehicleType, double rentalRate, String insurancePolicyNumber) {
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
