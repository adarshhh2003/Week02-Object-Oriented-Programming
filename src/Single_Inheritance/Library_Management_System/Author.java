package Single_Inheritance.Library_Management_System;

// Subclass
public class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
