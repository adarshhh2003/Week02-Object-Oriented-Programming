package Assisted_Problem.Animal_Hierarchy;

// Class bird extends animal class
public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
