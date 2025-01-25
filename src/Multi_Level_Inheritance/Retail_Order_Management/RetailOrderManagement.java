package Multi_Level_Inheritance.Retail_Order_Management;

// Main class
public class RetailOrderManagement {
    // Main method
    public static void main(String[] args) {
        // Create object of class
        Order shippedOrder = new ShippedOrder("582FG3694", "09-01-2025", "5424TN75");
        // Call the method
        shippedOrder.getOrderStatus();
        System.out.println();
        ShippedOrder deliveredOrder = new DeliveredOrder("582FG3694", "09-05-2025", "5424TN75", "25-01-2025");
        deliveredOrder.getOrderStatus();
    }
}
