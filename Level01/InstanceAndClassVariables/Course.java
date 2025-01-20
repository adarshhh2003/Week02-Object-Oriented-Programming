class CourseManagement {
    // Attributes
    private String courseName;
    private int courseDuration;
    private int fee;
    private static String instituteName;
    // Parameterized constructor
    public CourseManagement(String courseName, int courseDuration, int fee) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.fee = fee;
    }
    // Method to update institute name
    public static void updateInstituteName(String instituteName) {
        CourseManagement.instituteName = instituteName;
    }
    // Static method to display institute name
    public static void displayInstituteName() {
        System.out.println("Institute Name: " + instituteName);
    }
    // Method to display
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration (in-months): " + courseDuration);
        System.out.println("Fee: " + fee);
    }
}

public class Course {
    public static void main(String[] args) {
        // Using parameterized constructor
        CourseManagement course1 = new CourseManagement("Data Structure", 6, 6500);
        course1.displayCourseDetails();

        CourseManagement.updateInstituteName("bridgeLabz");
        CourseManagement.displayInstituteName();

        CourseManagement course2 = new CourseManagement("Computer Network", 2, 1000);
        course2.displayCourseDetails();
        // Call static method to display institute name
        CourseManagement.displayInstituteName();
    }
}
