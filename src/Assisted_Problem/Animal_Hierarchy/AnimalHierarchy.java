package Assisted_Problem.Animal_Hierarchy;

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create object of Animal class
        Animal animal = new Animal("Animal", 55);
        animal.makeSound();

        Animal dog = new Dog("Dog", 8);
        dog.makeSound();

        Animal cat = new Cat("Cat", 3);
        cat.makeSound();

        Animal bird = new Bird("Bird", 1);
        bird.makeSound();
    }
}
