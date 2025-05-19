package Java_concepts_programes.src.Logical_Programes.Strings;



// Interface
interface Vehicle {
    void start();
    void stop();
}

// Car class implements Vehicle
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// Bike class implements Vehicle
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

public class interface_demo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Bike myBike = new Bike();

        System.out.println("Using Car:");
        myCar.start();
        myCar.stop();

        System.out.println("\nUsing Bike:");
        myBike.start();
        myBike.stop();
    }
}
