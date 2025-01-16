import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Ticket is not booked initially
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("This ticket is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

}

class TicketBookingSystem {
    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for ticket details
        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter the seat number: ");
        String seatNumber = scanner.nextLine();
        System.out.print("Enter the ticket price: ");
        double price = scanner.nextDouble();

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        int choice;
        do {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayTicketDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using the Movie Ticket Booking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
