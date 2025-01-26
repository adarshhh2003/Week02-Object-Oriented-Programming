package ECommercePlatform;

import java.util.ArrayList;
import java.util.List;
// Main class
public class ECommercePlatform {
    // Main method
    public static void main(String[] args) {
        // Create object of class
        Electronics laptop = new Electronics("LT123", "Laptop", 55000.0);
        Clothing shirt  = new Clothing("S123", "Shirt", 1285.0);
        Groceries apple = new Groceries("A123", "Apple", 350.0);
        // List to store the objects
        List<Product> productList = new ArrayList<>();
        // Add objects to the list
        productList.add(laptop);
        productList.add(shirt);
        productList.add(apple);
        // Display result using for loop
        for(Product product: productList) {
            product.displayDetails();
            if(product instanceof Taxable) {
                System.out.println(((Taxable)product).getTaxDetails());
            }
            double tax = product instanceof Taxable? ((Taxable)product).calculateTax(): 0;
            System.out.println("Discount: " + product.calculateDiscount());
            System.out.println("Final Price: " + (product.getPrice() + tax - product.calculateDiscount()) + "\n");
        }
    }
}
