package Assisted_Problem.Employee_Management_System;

public class EmployeeManagementSystem {
    // Main method
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yash Kumar", 9492, 36000);
        emp1.displayDetails();

        Employee manager = new Manager("Adarsh Patel", 6561, 800000, 8);
        manager.displayDetails();

        Employee developer = new Developer("Raj Kumar", 656, 92500, "JAVA");
        developer.displayDetails();

        Employee intern = new Intern("Ritik Raj", 6641, 25000, 6);
        intern.displayDetails();
    }
}
