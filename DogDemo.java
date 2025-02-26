class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Color: " + color);
    }
}

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden");
        myDog.printDetails();
    }
}