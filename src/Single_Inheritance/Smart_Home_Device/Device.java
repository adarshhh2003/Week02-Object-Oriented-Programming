package Single_Inheritance.Smart_Home_Device;

// Supperclass
public class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // DisplayStatus method
    public void displayStatus() {
        System.out.println("Device Id: " + deviceId);
        System.out.println("Status: " + status);
    }
}
