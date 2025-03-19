package Java_concepts_programes.src.Day12_Polymorphism.Super_this_final_keywords.Super_keyword;

// Package declaration

// Parent class Animal
public class Animal {
    // Instance variable of parent class
    String color = "white";

    // Method of parent class
    void eat() {
        System.out.println("eating....");
    }

    // Default constructor of parent class
    Animal() {
        System.out.println("This is Animal..");
    }

    // Parameterized constructor of parent class
    Animal(String name) {
        System.out.println(name);
    }
}

// Child class Dog inheriting Animal
class Dog extends Animal {
    // Instance variable of child class
    String color = "black";

    // Method to display parent class variable
    void displayColor() {
        System.out.println("Parent class color: " + super.color);
    }

    // Overriding method of parent class
    @Override
    void eat() {
        super.eat(); // Call parent class method
        System.out.println("eating bread");
    }

    // Default constructor of child class
    Dog() {
        super(); // Invoke parent class constructor
        System.out.println("This is Dog..");
    }

    // Parameterized constructor of child class
    Dog(String name) {
        super(name); // Call parent class parameterized constructor
        System.out.println("This is Dog with name: " + name);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Creating instance of Dog class with default constructor
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.displayColor();

        System.out.println();

        // Creating instance of Dog class with parameterized constructor
        Dog dog2 = new Dog("Buddy");
        dog2.eat();
        dog2.displayColor();
    }
}