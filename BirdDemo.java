//this program shows the concepts of constructor overloading in java.
class Bird {
    private String name;
    private int age;

    // No-argument constructor
    public Bird() {
        this.name = "Unknown Bird"; 
        System.out.println("Bird created with no arguments: " + name);
    }

    // Constructor that takes the name of the bird
    public Bird(String name) {
        this.name = name;
        System.out.println("Bird created with name: " + name);
    }

    // Constructor that takes both name and age of the bird
    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Bird created with name: " + name + " and age: " + age);
    }

    public String getName() {
        return name;
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird bird1 = new Bird(); // No-argument constructor
        Bird bird2 = new Bird("Parrot"); // Constructor with name
        Bird bird3 = new Bird("Sparrow", 2); // Constructor with name and age

        System.out.println("Name of bird 1: " + bird1.getName());
        System.out.println("Name of bird 2: " + bird2.getName());
        System.out.println("Name of bird 3: " + bird3.getName());
    }
}
