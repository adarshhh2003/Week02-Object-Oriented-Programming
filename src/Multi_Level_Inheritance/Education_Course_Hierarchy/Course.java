package Multi_Level_Inheritance.Education_Course_Hierarchy;

// Class course
public class Course {
    // Attributes
    protected String courseName;
    protected int duration;
    // Parameterized constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    // DisplayInfo method
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}
