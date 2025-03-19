package Java_concepts_programes.src.Logical_Programes.Arrays;
import java.util.Scanner;

public class count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while (num > 0) {
            int rem = num % 10; // Extract last digit

            if (rem % 2 == 0) {
                even_count++; // Increment even count
            } else {
                odd_count++; // Increment odd count
            }

            num = num / 10; // Remove last digit
        }

        System.out.println("Even digits count: " + even_count);
        System.out.println("Odd digits count: " + odd_count);
        sc.close();
    }
}