package Assisted_Problem.Employee_Management_System;

// Class intern extends employee class
public class Intern extends Employee{
    private int internshipDuration;

    public Intern(String name, int id, int salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration is: " + internshipDuration + " months");
    }
}
