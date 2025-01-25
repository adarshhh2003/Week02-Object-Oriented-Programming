package Single_Inheritance.Smart_Home_Device;

// Subclass
public class Thermostat extends Device{
    private double temperatureSetting;
    // Parameterized constructor
    public Thermostat(String id, String status, double temperatureSetting) {
        super(id, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " Degree celsius");
    }
}
