package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Arrays_sum {
    public static void main(String[]args) {
        // Taking input for array size
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n]; // Declare array

        // Taking input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i=0;i<n;i++){
             sum+=a[i];
        // Print sum
        sc.close();
    }
        System.out.println("Sum of array elements: " + sum);
}}
