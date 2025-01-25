package Multi_Level_Inheritance.Retail_Order_Management;

// Class deliveredorder extends shippedorder
public class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;

    public DeliveredOrder(String id, String orderDate,String trackingNumber, String deliveryDate) {
        super(id, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
