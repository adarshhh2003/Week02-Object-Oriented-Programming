package Single_Inheritance.Smart_Home_Device;

// Main class
public class SmartHomeDevice {
    // Main method
    public static void main(String[] args) {
        Device thermostat = new Thermostat("TH12345", "Online", 22.5);
        thermostat.displayStatus();
    }
}
