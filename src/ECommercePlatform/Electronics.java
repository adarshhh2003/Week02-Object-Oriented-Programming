package ECommercePlatform;
// Class Electronics extends Product class and implements Taxable
public class Electronics extends Product implements Taxable{
    private static final double tax = 0.18;

    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * tax;
    }

    public String getTaxDetails() {
        return "Tax Rate 18%";
    }
}
