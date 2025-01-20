public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;
    // Default constructor
    public HotelBooking() {
        this("Unknown Guest", "Local Room", 1);
    }
    // Parameterized constructor
    public HotelBooking(String gustName, String roomType, int nights) {
        this.guestName = gustName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    // Method to display results
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

class HotelBookingDetails {
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayDetails();

        System.out.println();
        // Using parameterized constructor
        HotelBooking customBooking = new HotelBooking("Rohan", "Luxury Room", 6);
        customBooking.displayDetails();

        System.out.println();
        // Using copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        copiedBooking.displayDetails();
    }
}
