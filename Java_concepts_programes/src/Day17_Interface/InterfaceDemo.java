package Java_concepts_programes.src.Day17_Interface;
// Defining an interface named "Shape"
interface Shape
{
    // Interface variables are always public, static, and final (constants).
    int length = 10;  // This is final and static by default.
    int width = 20;   // This is also final and static by default.

    // Abstract method (must be implemented by a class that implements this interface).
    void circle(int a);

    // Default method (can have a body, does not need to be overridden).
    default void square()
    {
        System.out.println("This is square - default method....");
    }

    // Static method (belongs to the interface itself, cannot be overridden).
    static void rectangle()
    {
        System.out.println("This is rectangle - static method...");
    }
}

// Class implementing the "Shape" interface
public class InterfaceDemo implements Shape
{
    // Overriding the abstract method from the "Shape" interface
    public void circle(int a)
    {
        System.out.println("This is circle - abstract method..."+(a+a));
    }

    // Class-specific method (not part of the interface)
    void triangle()
    {
        System.out.println("This is triangle..");
    }


    public static void main(String[] args)
    {
        // ************ Scenario 1: Using Class Reference ************
        System.out.println("Scenario 1:");

        // Creating an object of InterfaceDemo
        InterfaceDemo idobj = new InterfaceDemo();

        idobj.circle(10);  // Calls overridden abstract method from InterfaceDemo
        idobj.square();  // Calls default method from the interface (not overridden in class)

        // Calling static method from interface (must be called using interface name)
        Shape.rectangle();

        // Accessing static final variables from interface
        System.out.println("Sum of length and width: " + (Shape.length + Shape.width));

        // Calling class-specific method (not part of the interface)
        idobj.triangle();

        System.out.println("-------------------------------------------------");

        // ************ Scenario 2: Using Interface Reference ************
        System.out.println("Scenario 2:");

        // Creating an object with a reference of type "Shape"
        Shape sh = new InterfaceDemo(); // Dynamic method dispatch

        sh.circle(10);  // Calls overridden method in InterfaceDemo (Runtime Polymorphism)
        sh.square();  // Calls default method from interface

        // Static method cannot be accessed using an interface reference
        // sh.rectangle(); // ERROR: Cannot access static method using reference variable

        Shape.rectangle(); // Correct way to call static method

        // sh.triangle(); // ERROR: Cannot access class-specific method using interface reference
    }
}
