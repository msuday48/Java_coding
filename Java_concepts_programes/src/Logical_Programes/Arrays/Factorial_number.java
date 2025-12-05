package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Factorial_number {


    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }


        System.out.println("Factorial of given number: " + factorial);
    }
}

