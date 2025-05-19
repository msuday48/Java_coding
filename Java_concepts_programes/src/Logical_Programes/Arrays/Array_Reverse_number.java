package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Array_Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many numbers they want to input
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        // Create array of size n
        int[] numbers = new int[n];

        // Input numbers one by one

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print array in reverse order
        System.out.println("Reversed numbers:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print( numbers[i]);
        }

        sc.close();
    }
}
