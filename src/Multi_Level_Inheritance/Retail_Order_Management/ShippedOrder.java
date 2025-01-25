package Multi_Level_Inheritance.Retail_Order_Management;

// Class shippedorder extends order
public class ShippedOrder extends Order{
    private String trackingNumber;

    public ShippedOrder(String id, String orderDate, String trackingNumber) {
        super(id, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
