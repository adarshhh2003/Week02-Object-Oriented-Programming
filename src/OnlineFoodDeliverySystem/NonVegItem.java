package OnlineFoodDeliverySystem;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getQuantity() * getPrice() + additionalCharge) - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (getPrice() * getQuantity() + additionalCharge) * (discountPercentage / 100);
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}