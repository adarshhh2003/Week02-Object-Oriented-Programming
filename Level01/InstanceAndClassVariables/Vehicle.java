class VehicleRegistration {
    // Attributes
    private String ownerName;
    private String vehicleType;
    private static int registrationFee = 3500;
    // Using parameterized constructor
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Method to update registration fee
    public static void updateRegistrationFee(int registrationFee) {
        VehicleRegistration.registrationFee = registrationFee;
    }
    // Method to display results
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
}
public class Vehicle {
    public static void main(String[] args) {
        // Using parameterized constructor
        VehicleRegistration vehicle1 = new VehicleRegistration("Adarsh", "Car");
        vehicle1.displayVehicleDetails();
        // Updating vehicle registration fee
        VehicleRegistration.updateRegistrationFee(4500);
        // Call the display method to display details
        vehicle1.displayVehicleDetails();
    }
}
