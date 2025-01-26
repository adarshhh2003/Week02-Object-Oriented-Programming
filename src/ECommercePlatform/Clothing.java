package ECommercePlatform;
// Class Clothing extends Product class and implements Taxable
public class Clothing extends Product implements Taxable{
    private static double tax = 0.12;

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.2;
    }

    public double calculateTax() {
        return getPrice() * tax;
    }

    public String getTaxDetails() {
        return "Tax Rate: 12%";
    }
}
