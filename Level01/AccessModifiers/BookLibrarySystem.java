class Book {
    public String ISBM;
    protected String title;
    private String author;

    public Book(String ISBM, String title, String author) {
        this.ISBM = ISBM;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayDetails() {
        System.out.println("ISBM: " + ISBM);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    public EBook(String ISBM, String title, String author) {
        super(ISBM, title, author);
    }

    public void displayResults() {
        System.out.println("ISBM: " + ISBM);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook eBook = new EBook("6661.151.25", "Operating System", "James Gotling");
        eBook.displayResults();

        System.out.println("ISBM: " + eBook.ISBM);
        System.out.println("Title: " + eBook.title);

        eBook.setAuthor("Glause Watt");
        System.out.println("Author: " + eBook.getAuthor());
    }
}