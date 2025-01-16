import java.util.*;
// Class Employee to display the details
class Employee {
    // Attributes
    String name;
    String id;
    int salary;

    // Constructor of the class to get input
    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display the details of Employee
    public void displayDetails() {
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The id of the Employee is: " + id);
        System.out.println("The salary of the Employee is: " + salary);
    }
}

// Main class
class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt a message to the user to enter the name
        System.out.println("Enter the name of Employe: ");
        String name = input.nextLine();

        System.out.println("Enter the id of the Employee");
        String id = input.nextLine();

        System.out.println("Enter the salary of the Employee");
        int salary = input.nextInt();

        // Create obj of the Employee class to call the displayDetails method
        Employee obj = new Employee(name, id, salary);
        obj.displayDetails();

        // Close the scanner object to release resources
        input.close();
    }
}

