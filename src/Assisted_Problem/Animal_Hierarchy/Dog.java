package Assisted_Problem.Animal_Hierarchy;

// Class dog ectends the properties of animal class
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    // Method makeSound
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
