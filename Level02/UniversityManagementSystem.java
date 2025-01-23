import java.util.ArrayList;
import java.util.List;

// Course Class
class Courses {
    private String courseName;
    private Professor professor;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
}

// Student Class
class Students {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Professor Class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main Class for Testing
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Students
        Students student1 = new Students("Alice");
        Students student2 = new Students("Bob");

        // Create Professor
        Professor professor = new Professor("Dr. Smith");

        // Create Courses
        Courses course1 = new Courses("Mathematics");
        Courses course2 = new Courses("Physics");

        // Assign Professor to Courses
        course1.assignProfessor(professor);
        course2.assignProfessor(professor);

        // Display Details
        System.out.println("Professor: " + professor.getName() + " teaches:");
        System.out.println("  - " + course1.getCourseName());
        System.out.println("  - " + course2.getCourseName());

        System.out.println("\nStudents:");
        System.out.println("  - " + student1.getName());
        System.out.println("  - " + student2.getName());
    }
}
