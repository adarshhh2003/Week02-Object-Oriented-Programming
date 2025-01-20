class StudentDetails {
    // Attributes
    public String rollNumber;
    protected String name;
    private double CGPA;
    // Parameterized constructor
    public StudentDetails(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    // Method to update CGPA
    public void updateCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Please enter valid CGPA again.");
        }
    }

    // Display the results
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
// Subclass
class PostgraduateStudent extends StudentDetails {
    private String thesisTitle;
    // Parameterized constructor
    public PostgraduateStudent(String rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }
    // Display results
    public void displayResults() {
        System.out.println("Post Graduate Students Details: ");
        displayDetails();
        System.out.println("Thesis Title: " + thesisTitle);
    }

}

public class Student {
    public static void main(String[] args) {
        // Using parameterized constructor
        StudentDetails s1 = new StudentDetails("0191", "Adarsh", 8.8);
        s1.displayDetails();
        System.out.println();
        s1.updateCGPA(9.2);
        System.out.println();
        s1.displayDetails();
        System.out.println();
        // Using parameterized constructor in subclass
        PostgraduateStudent pgS1 = new PostgraduateStudent("0258", "Aryan", 9.5, "AI Research");
        pgS1.displayResults();
    }
}
