package Multi_Level_Inheritance.Education_Course_Hierarchy;

// Class paidonlinecourse extends onlinecourse
public class PaidOnlineCourse extends OnlineCourse{
    private int fee;
    private int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + " %");
    }
}
