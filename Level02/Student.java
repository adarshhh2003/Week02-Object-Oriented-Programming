import java.util.Scanner;
// Student class
public class Student {
    // Attributes
    String name;
    String rollNumber;
    double marks;
    // Constructor to get input
    Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Method to calculate grade of student
    public char grade() {
        if(marks >= 80) {
            return 'A';
        } else if(marks >= 70) {
            return 'B';
        } else if(marks >= 60) {
            return 'C';
        } else if(marks >= 50) {
            return 'D';
        } else if(marks >= 33) {
            return 'E';
        } else {
            return 'F';
        }
    }
    // Method to display the results
    public void displayResults() {
        System.out.println("The name of student is: " + name);
        System.out.println("The roll number of the student is: " + rollNumber);
        System.out.println("The marks of the student is: " + marks);
        System.out.println("The grade of the student is: " + grade());
    }

}
// Main class
class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt to get input from the user
        System.out.println("Enter the name of the student: ");
        String name = input.nextLine();

        System.out.println("Enter the roll number of the student: ");
        String rollNumber = input.nextLine();

        System.out.println("Enter the marks of the student: ");
        double marks = input.nextDouble();
        // Create a class object
        Student obj = new Student(name, rollNumber, marks);
        // Call the method
        obj.displayResults();
        // Close the scanner object to release resources
        input.close();
    }
}
