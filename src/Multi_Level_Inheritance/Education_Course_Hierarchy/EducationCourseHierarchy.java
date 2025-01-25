package Multi_Level_Inheritance.Education_Course_Hierarchy;

// Main class
public class EducationCourseHierarchy {
    // Main method
    public static void main(String[] args) {
        // Create object of class
        Course onlinecourse = new OnlineCourse("Fullstack Development", 6, "Google ClassRoom", true);
        // Call the method
        onlinecourse.displayInfo();
        System.out.println();
        OnlineCourse paidOnlineCourse = new PaidOnlineCourse("Fullstack Development", 6, "Google ClassRoom", true, 7300, 10);
        paidOnlineCourse.displayInfo();
    }
}
