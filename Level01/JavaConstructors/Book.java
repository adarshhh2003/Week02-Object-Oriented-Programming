public class Book {
    private String title;
    private String author;
    private double price;
    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    // Method to set the price
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Price cannot be negative, setting price to 0");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
    // Method to display result
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        System.out.println();
        // Using parameterized constructor
        Book specificBook = new Book("1998", "James Glone" , 14.57);
        specificBook.displayDetails();
    }
}