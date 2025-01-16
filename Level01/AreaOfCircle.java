import java.util.*;
// Class AreaOfCircle to display the results
class AreaOfCircle {
    // Attributes
    int radius;

    // Constructor to get input from the user to this class
    AreaOfCircle(int radius) {
        this.radius = radius;
    }

    // Method to display the results
    public void displayResults() {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        double circumferenceOfCircle = 2 * Math.PI * radius;
        System.out.println("The area of circle is: " + areaOfCircle);
        System.out.println("The area of circumference is: " + circumferenceOfCircle);
    }
}

// Main class
class CalculateAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt to enter the radius of circle
        System.out.println("Enter the radius of circle: ");
        int radius = input.nextInt();

        // Create object of class
        AreaOfCircle obj = new AreaOfCircle(radius);
        obj.displayResults();

        // Close the scanner object to release resources
        input.close();
    }
}
