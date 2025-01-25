package Assisted_Problem.Animal_Hierarchy;

// Class cat extends animal class
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Cat meows");
    }
}
