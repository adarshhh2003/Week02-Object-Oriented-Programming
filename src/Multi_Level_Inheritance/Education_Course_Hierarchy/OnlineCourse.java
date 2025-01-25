package Multi_Level_Inheritance.Education_Course_Hierarchy;

// Class onlinecourse extends course
public class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
    }
}
