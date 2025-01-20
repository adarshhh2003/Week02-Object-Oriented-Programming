public class Circle {
    private double radius;
    // Default constructor
    public Circle() {
        this(1.0);  // Constructor chaining, sets default radius to 1.0
    }
    // Parameterized constructor
    public Circle(double radius) {
        if(radius < 0) {
            System.out.println("Radius cannot be negative. Setting it to 0");
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            System.out.println("Radius cannot be negative. Setting it to 0");
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }
    }
    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    // Display results
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

}

class AreaAndCircumference {
    public static void main(String[] args) {
        // Using the default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();

        System.out.println();
        // Using the parameterized constructor
        Circle customCircle = new Circle(5.0);
        customCircle.displayDetails();
    }
}