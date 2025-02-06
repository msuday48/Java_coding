package Java_concepts_programes.src.Day12_Polymorphism.Overloading_vs_Overriding;

class ABC {
    void m1(int a) {
        System.out.println("Parent class m1: " + a);
    }

    void m2(int b) {
        System.out.println("Parent class m2: " + b);
    }
}

class XYZ extends ABC {
    // Overriding m1 method
    @Override
    void m1(int a) {
        System.out.println("Child class m1 (Square): " + (a * a));
    }

    // Overriding m2 method
    @Override
    void m2(int b) {
        System.out.println("Child class m2 (Square): " + (b * b));
    }

    // Overloading m2 method
    void m2(int a, int b) {
        System.out.println("Child class m2 (Sum): " + (a + b));
    }
}
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        XYZ xyzobj = new XYZ();
        xyzobj.m1(10);        // Calls overridden m1 in XYZ
        xyzobj.m2(5);         // Calls overridden m2 in XYZ
        xyzobj.m2(10, 20);    // Calls overloaded m2 in XYZ
    }
}