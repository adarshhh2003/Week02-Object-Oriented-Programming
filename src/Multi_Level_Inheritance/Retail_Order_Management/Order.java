package Multi_Level_Inheritance.Retail_Order_Management;

// Class order
public class Order {
    protected String orderId;
    protected String orderDate;
    // Parameterized constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    // Method to display the status
    public void getOrderStatus() {
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
