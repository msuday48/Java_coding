package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Arrays2_common_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.println("Enter the number of elements in the first array:");
        int n1 = sc.nextInt();
        int[] no = new int[n1];

        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            no[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.println("Enter the number of elements in the second array:");
        int n2 = sc.nextInt();
        int[] num = new int[n2];

        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int j = 0; j < n2; j++) {
            num[j] = sc.nextInt();
        }

        int sum = 0; // Sum of common elements

        // Finding common elements
        System.out.println("Common elements in both arrays:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (no[i] == num[j]) {
                    sum += no[i]; // Correct sum calculation
                    System.out.print(no[i] + " "); // Print common element
                    break; // Avoid duplicate counting
                }
            }
        }

        // Print the sum of common elements
        System.out.println("\nSum of common elements: " + sum);

        sc.close();
    }
}
