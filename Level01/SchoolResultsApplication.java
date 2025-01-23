import java.util.ArrayList;
import java.util.List;

// Class representing a Student
class Student {
    private String name;
    private String studentId;
    private List<Subject> subjects;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
    }

    // Add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Get list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}

// Class representing a Subject
class Subject {
    private String name;
    private double score;

    // Constructor
    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

// Class responsible for calculating grades
class GradeCalculator {

    // Calculate average score for a student
    public double calculateAverage(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) return 0.0;

        double total = 0.0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total / subjects.size();
    }

    // Determine grade based on average score
    public String determineGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}

// Main class to demonstrate functionality
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Adarsh Patel", "S12345");

        // Add subjects and scores
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 92));
        student.addSubject(new Subject("History", 78));

        // Create a GradeCalculator
        GradeCalculator calculator = new GradeCalculator();

        // Calculate average and grade
        double average = calculator.calculateAverage(student);
        String grade = calculator.determineGrade(average);

        // Display results
        System.out.println("Student: " + student.getName());
        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);
    }
}
