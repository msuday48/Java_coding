package Java_concepts_programes.src.Day11_Methods_Constructors.Methods;

public class Students {
    int sid;
    String sname;
    char grad;

    // Default Constructor
    Students() {
        // No initialization done here, default constructor can be used for object creation
    }

    // Parameterized Constructor
    Students(int id, String name, char g) {
        sid = id;
        sname = name;
        grad = g;
    }

    // Method to display student data
    void displayStudentData() {
        System.out.println("Student ID: " + sid + ", Name: " + sname + ", Grade: " + grad);
    }

    // Method to set student data
    void setStudentData(int id, String name, char g) {
        sid = id;
        sname = name;
        grad = g;
    }
}