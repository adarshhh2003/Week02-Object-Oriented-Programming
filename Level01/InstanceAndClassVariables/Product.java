class ProductInventory {
    private String productName;
    private int price;
    // Using static keyword to calculate total product
    private static int totalProducts;
    // Parameterized constructor
    public ProductInventory(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    // Method to display total product
    public static void displayTotalProduct() {
        System.out.println("Total Products: " + totalProducts);
    }
    // Method to display result
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

}
public class Product {
    public static void main(String[] args) {
        // Using parameterized constructor
        ProductInventory product1 = new ProductInventory("Laptop", 50000);
        // Call the displayProductDetails method with the help of class instance
        product1.displayProductDetails();
        // Calling displayTotalProduct method with the help of class name because it is a static method;
        ProductInventory.displayTotalProduct();

        System.out.println();

        ProductInventory product2 = new ProductInventory("SmartPhone", 15000);
        product2.displayProductDetails();

        ProductInventory.displayTotalProduct();
    }
}
