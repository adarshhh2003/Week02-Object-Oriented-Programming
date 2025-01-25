package Assisted_Problem.Employee_Management_System;

public class Employee {
    private String name;
    private int id;
    private int salary;
    // Parameterized constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}
