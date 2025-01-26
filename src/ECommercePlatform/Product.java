package ECommercePlatform;
// Abstract Class Product
public abstract class Product {
    private String productId;
    private String name;
    private double price;
    // Parameterized constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Abstract method
    public abstract double calculateDiscount();
    // Method to display the output
    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
