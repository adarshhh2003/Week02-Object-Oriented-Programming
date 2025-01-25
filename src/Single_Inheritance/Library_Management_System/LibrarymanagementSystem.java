package Single_Inheritance.Library_Management_System;

// Main class
public class LibrarymanagementSystem {
    // Main method
    public static void main(String[] args) {
        // Create an author object
        Book author = new Author("The Alchemist", 1988, "Paulo Coelho", "A Brazilian author known for spiritual and philosophical novels.");
        // Display the book and author information
        author.displayInfo();
    }
}
