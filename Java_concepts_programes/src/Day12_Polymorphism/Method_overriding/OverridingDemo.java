package Java_concepts_programes.src.Day12_Polymorphism.Method_overriding;

// Parent class
class Bank {
    void rateofinterest(double b) {
        System.out.println("Bank interest rate: " + b + "%");
    }

    void acc_details(int accno, double balance) {
        System.out.println("Account Number: " + accno + ", Balance: ₹" + balance);
    }
}

// Child class HDFC
class HDFC extends Bank {
    @Override
    void rateofinterest(double c) {
        System.out.println("HDFC Bank interest rate: " + c + "%");
    }

    @Override
    void acc_details(int accno, double balance) {
        System.out.println("HDFC Account - Number: " + accno + ", Balance: ₹" + balance);
    }
}

// Child class ICICI
class ICICI extends Bank {
    @Override
    void rateofinterest(double c) {
        System.out.println("ICICI Bank interest rate: " + c + "%");
    }

    @Override
    void acc_details(int accno, double balance) {
        System.out.println("ICICI Account - Number: " + accno + ", Balance: ₹" + balance);
    }
}

// Main class
public class OverridingDemo {
    public static void main(String[] args) {

        Bank rbi = new Bank();
        HDFC bank1 = new HDFC();   // Direct object of HDFC
        ICICI bank2 = new ICICI(); // Direct object of ICICI

        // Calling overridden methods
        bank1.rateofinterest(7.1);
        bank1.acc_details(123456, 55000.75);

        System.out.println("--------------------");

        bank2.rateofinterest(6.9);
        bank2.acc_details(789101, 90000.25);
    }
}
