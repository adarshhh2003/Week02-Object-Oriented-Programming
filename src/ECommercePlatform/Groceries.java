package ECommercePlatform;
// Class Groceries extends Product class
public class Groceries extends Product{

    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
