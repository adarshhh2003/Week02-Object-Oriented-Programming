package OnlineFoodDeliverySystem;

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}