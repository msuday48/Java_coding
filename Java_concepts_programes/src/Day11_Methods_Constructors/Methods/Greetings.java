package Java_concepts_programes.src.Day11_Methods_Constructors.Methods;

public class Greetings {
    // 1) No parameters, no return value
    void m1() {
        System.out.println("Hello");
    }

    // 2) No parameters, returns a value
    String m2() {
        return "Hello, how are you?";
    }

    // 3) Takes parameters, no return value
    void m3(String name) {
        System.out.println("Hello " + name);
    }

    // 4) Takes parameters, returns a value (Corrected)
    String m4(String name) {
        return "Hello " + name;
    }
}
