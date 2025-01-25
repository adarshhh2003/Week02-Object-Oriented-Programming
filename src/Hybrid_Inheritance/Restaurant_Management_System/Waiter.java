package Hybrid_Inheritance.Restaurant_Management_System;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers and taking orders.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
    }
}