import java.util.ArrayList;
import java.util.List;

// Class representing a Customer
class Customer {
    private String name;
    private List<Product> purchasedProducts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    // Add a product to the purchased list
    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    // Get list of purchased products
    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Product
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total price for this product
    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Class responsible for generating the bill
class BillGenerator {

    // Generate a simple bill
    public void generateBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");

        double total = 0.0;
        for (Product product : customer.getPurchasedProducts()) {
            double productTotal = product.getTotalPrice();
            total += productTotal;
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity() + ", Total: " + productTotal);
        }

        System.out.println("Total Bill: " + total);
    }
}

// Main class to demonstrate functionality
public class GroceryStoreBillApplication {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Adarsh Patel");

        // Add purchased products
        customer.addProduct(new Product("Apples", 1.2, 5));
        customer.addProduct(new Product("Bread", 2.5, 2));
        customer.addProduct(new Product("Milk", 1.5, 3));

        // Generate and display the bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}