package OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        // Create food items
        VegItem vegBurger = new VegItem("Veg Burger", 5.99, 2);
        NonVegItem chickenWings = new NonVegItem("Chicken Wings", 8.99, 1, 2.0);

        // Apply discounts
        vegBurger.applyDiscount(10); // 10% discount
        chickenWings.applyDiscount(5); // 5% discount

        // Add items to the order
        order.add(vegBurger);
        order.add(chickenWings);

        // Process and display order details
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println("Discount Applied: " + discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}