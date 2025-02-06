package Java_concepts_programes.src.Day11_Methods_Constructors.Constructors;

public class Constructor_Demo {
    int x, y;

    // Default constructor
    Constructor_Demo() {
        x = 20;
        y = 10;
    }

    // Parameterized constructor
    Constructor_Demo(int a, int b) {
        x = a;
        y = b;
    }

    // Method to calculate the sum
    void sum() {
        System.out.println("Sum: " + (x + y));
    }

    public static void main(String[] args) {
        // Using the default constructor
        Constructor_Demo cd1 = new Constructor_Demo();
        cd1.sum(); // Output: Sum: 30

        // Using the parameterized constructor
        Constructor_Demo cd2 = new Constructor_Demo(50, 70);
        cd2.sum(); // Output: Sum: 120
    }
}