package Java_concepts_programes.src.Day13Inheritance.Multilevel_inheritance;

// Base Class - Level 1
class User {
    String name;
    String email;

    void login() {
        System.out.println(name + " logged in with email: " + email);
    }
}

// Derived Class - Level 2
class Customer extends User {
    void shop() {
        System.out.println(name + " is shopping on the platform.");
    }
}

// Derived Class - Level 3
class PrimeCustomer extends Customer {
    void accessPrimeDeals() {
        System.out.println(name + " is accessing Prime-exclusive deals.");
    }
}

// Main class to test multilevel inheritance
public class ECommerceApp {
    public static void main(String[] args) {
        PrimeCustomer pc = new PrimeCustomer();

        pc.name = "Uday";
        pc.email = "uday@example.com";

        pc.login();              // From User class
        pc.shop();               // From Customer class
        pc.accessPrimeDeals();   // From PrimeCustomer class
    }
}

