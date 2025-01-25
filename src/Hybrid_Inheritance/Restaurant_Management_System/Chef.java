package Hybrid_Inheritance.Restaurant_Management_System;

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing dishes and managing the kitchen.");
    }

    public void displayRole() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}