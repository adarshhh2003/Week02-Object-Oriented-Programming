public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;
    // Default constructor
    public Person() {
        this("Unknown", 0, "Unknown Address"); // Chaining constructor
    }
    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // Display results
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address" + address);
    }
}

class PersonDetails {
    public static void main(String[] args) {
        // Using parameterized constructor
        Person person1 = new Person("Rohan", 21, "Indore MP");
        person1.displayDetails();

        System.out.println();
        // Using copy constructor
        Person person2 = new Person(person1);
        person2.displayDetails();

        person2.setName("Mohan");
        person2.setAge(28);
        person2.displayDetails();
    }
}