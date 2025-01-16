import java.util.Scanner;

// Class MobilePhone
class MobilePhone {
    // Attributes
    String brand;
    String model;
    int price;

    // Constructor to get the results
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display results
    public void displayResults() {
        System.out.println("The brand of the phone is: " + brand);
        System.out.println("The model of the phone is: " + model);
        System.out.println("The price of the phone is: " + price);
    }
}

// Main class
class HandleMobilePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create objects of the class
        MobilePhone iPhone = new MobilePhone("i phone", "16 pro", 90000);
        iPhone.displayResults();

        // Create object of the class
        MobilePhone samsung = new MobilePhone("Samsung", "Z fold", 45000);
        samsung.displayResults();

        // Close scanner object to release resources
        input.close();
    }
}