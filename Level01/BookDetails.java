import java.util.Scanner;

// Class BookDetails to display the results
public class BookDetails {
    String title;
    String author;
    int price;

    // Constructor to get the input
    BookDetails(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to print the results
    public void displayResults() {
        System.out.println("The title of the book is: " + title);
        System.out.println("The author of the book is: " + author);
        System.out.println("The price of the book is: " + price);
    }
}

// Main class
class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt to take input from the user
        System.out.println("Enter the title of book: ");
        String title = input.nextLine();

        System.out.println("Enter the author of book");
        String author = input.nextLine();

        System.out.println("Enter the price of book: ");
        int price = input.nextInt();

        // Create object of the class
        BookDetails obj = new BookDetails(title, author, price);

        // Call the method of class with the help of object
        obj.displayResults();

        // Close the scanner object to release resources
        input.close();
    }
}