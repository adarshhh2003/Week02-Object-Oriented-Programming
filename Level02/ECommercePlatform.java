import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order Class
class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Customer Class
class Customers {
    private String name;

    public Customers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main Class for Testing
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create Customer
        Customers customer = new Customers("Alice");

        // Create Products
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Mouse", 25.00);

        // Create Order and Add Products
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        // Display Details
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Total: $" + order.calculateTotal());
    }
}
