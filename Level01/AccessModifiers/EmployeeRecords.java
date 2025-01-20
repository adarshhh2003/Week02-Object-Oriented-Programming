class Employee {
    // Attributes
    public int employeeId;
    protected String department;
    private int salary;
    // Parameterized constructor
    public Employee(int employeeId, String department, int salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
    // Method to set salary
    public void setSalary(int salary) {
        if(salary < 0) {
            System.out.println("Salary cannot be less than or equal to zero.");
        } else {
            this.salary = salary;
        }
    }
    // Method to get salary
    public int getSalary() {
        return salary;
    }
    // Method to display results
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
// Subclass
class Manager extends Employee {
    // Parameterized constructor
    public Manager(int employeeId, String department, int salary) {
        super(employeeId, department, salary);
    }
    // Method to display the results
    public void displayResults() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}
// Main Class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Instance of the class Manager
        Manager obj = new Manager(156485, "Bussiness Process", 45000);
        obj.displayResults();
        System.out.println();
        System.out.println("Employee ID: " + obj.employeeId);
        System.out.println("Department: " + obj.department);
        obj.setSalary(52000);
        System.out.println("Salary: " + obj.getSalary());
    }
}
