package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Arrays_count_even_odd_numbers {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    // Input size of array
        System.out.println("Enter the number of elements:");
    int n = sc.nextInt();

    int[] no = new int[n];

    // Taking input for the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
        no[i] = sc.nextInt();
    }

    int even_count = 0;
    int odd_count = 0;

    // Counting even and odd numbers in the array
        for (int i = 0; i < n; i++) {
        if (no[i] % 2 == 0) {
            even_count++; // Increment even count
        } else {
            odd_count++; // Increment odd count
        }
    }

    // Output results
        System.out.println("Even numbers count: " + even_count);
        System.out.println("Odd numbers count: " + odd_count);

        sc.close();
}
}