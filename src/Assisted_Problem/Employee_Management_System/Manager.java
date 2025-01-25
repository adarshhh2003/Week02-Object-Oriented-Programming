package Assisted_Problem.Employee_Management_System;

// Class manager extends employee class
public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
