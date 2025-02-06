package Java_concepts_programes.src.Day11_Methods_Constructors.Methods;

public class StudentMain {
    public static void main(String[] args) {
        // 1) Assign data using object reference
        Students stu1 = new Students(); // Default constructor
        stu1.sid = 45;
        stu1.sname = "Uday";
        stu1.grad = 'U';
        stu1.displayStudentData(); // Output: Student ID: 45, Name: Uday, Grade: U

        // 2) Assign data using user-defined method
        Students stu2 = new Students(); // Default constructor
        stu2.setStudentData(101, "John", 'B');
        stu2.displayStudentData(); // Output: Student ID: 101, Name: John, Grade: B

        // 3) Assign data using parameterized constructor
        Students stu3 = new Students(102, "Alice", 'A');
        stu3.displayStudentData(); // Output: Student ID: 102, Name: Alice, Grade: A
    }
}
