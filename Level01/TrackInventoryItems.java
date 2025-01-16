import java.util.Scanner;

// items class
class Items {
    // Attributes
    String itemCode;
    String itemName;
    int price;
    int quantity;

    // Constructor to get the input
    Items(String itemCode, String itemName, int price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display the results
    public void displayResults() {
        // Calculate total
        int total = quantity * price;

        // Display the results
        System.out.println("The item code is: " + itemCode);
        System.out.println("The item name is: " + itemName);
        System.out.println("The item price is: " + price);
        System.out.println("The total cost for the quantity " + quantity + " and price " + price + " is: " + total);
    }
}

// Main class
class TrackInventoryItems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt to take input from the user
        System.out.println("Enter the item code: ");
        String itemCode = input.nextLine();

        System.out.println("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.println("Enter the price of item: ");
        int price = input.nextInt();

        System.out.println("Enter the quantity of the item: ");
        int quantity = input.nextInt();

        // Create class object
        Items obj = new Items(itemCode, itemName, price, quantity);

        // Call the method with the help of object
        obj.displayResults();

        // Close the scanner object to release resources
        input.close();
    }
}