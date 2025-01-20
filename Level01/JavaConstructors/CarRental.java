class CarRentalSystem {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    // Default constructor
    protected CarRentalSystem() {
        this("Unknown", "Local Car", 1);
    }
    // Parameterized constructor
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    // Copy constructor
    public CarRentalSystem(CarRentalSystem other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }
    // Calculate total cost
    public int totalCost(int price) {
        return price * rentalDays;
    }
    // Method to display the results
    public void displayResults(int price) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost(price));
    }
}

public class CarRental {
    public static void main(String[] args) {
        // Using parameterized  constructor
        CarRentalSystem car1 = new CarRentalSystem("Adarsh", "Luxury", 4);
        car1.displayResults(1500);

        System.out.println();
        // Using copy constructor
        CarRentalSystem car2 = new CarRentalSystem(car1);
        car2.displayResults(1000);
    }
}
