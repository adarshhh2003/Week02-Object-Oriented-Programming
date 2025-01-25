package Hierarchical_Inheritance.School_System;

// Main class
public class SchoolSystem {
    // Main method
    public static void main(String[] args) {
        // Create obbject of classes
        Teacher teacher = new Teacher("Riyaz Sir", 28, "Mathematics");
        Student student = new Student("Mohit Kumar", 14, "B+");
        Staff staff = new Staff("Dhruv Rathore", 25, "Electrical and Electronics");
        // Call the methods
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        student.displayInfo();
        student.displayRole();
        System.out.println();

        staff.displayInfo();
        staff.displayRole();
    }
}
