package Hybrid_Inheritance.Restaurant_Management_System;

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John", 102, "Outdoor Seating");

        // Display roles and information
        chef.displayInfo();
        chef.displayRole();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.displayRole();
        waiter.performDuties();
    }
}
