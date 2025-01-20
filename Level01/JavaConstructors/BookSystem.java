public class BookSystem {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    // Default constructor
    public BookSystem() {
        this("Unknown Title", "Unknown Author", 0.0, true);
    }
    // Parameterized constructor
    public BookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    // Copy constructor
    public BookSystem(BookSystem other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.isAvailable = other.isAvailable;
    }
    // Method to borrow the book
    public boolean borrow() {
        if(isAvailable) {
            System.out.println("The book " + title + " has been successfully borrowed.");
            isAvailable = false;
            return true;
        } else {
            System.out.println("Sorry the book " + title + " is currently unavailable.");
            return false;
        }
    }
    // Method to display results
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

}

class LibraryBookSystem {
    public static void main(String[] args) {
        // Using parameterized constructor
        BookSystem book1 = new BookSystem("The Great Man", "Whales Jotlin", 55.62, true);
        // Call the method to display results
        book1.displayDetails();

        System.out.println();
        // Call the borrow method to buy the book1
        book1.borrow();

        System.out.println();
        // Call the borrow method to buy the book1 again
        book1.borrow();

        System.out.println();
        // Call the method to display results
        book1.displayDetails();
    }
}
