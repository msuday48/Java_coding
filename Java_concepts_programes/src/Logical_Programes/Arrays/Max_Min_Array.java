
 package Java_concepts_programes.src.Logical_Programes.Arrays;

 import java.util.Scanner;

 public class Max_Min_Array
{
   public static void main(String[]args){

         Scanner sc = new Scanner(System.in);

         // Take input for array size
         System.out.println("Enter the number of elements:");
         int n = sc.nextInt();


         int[] no = new int[n]; // Declare array

         // Take array input from user
         System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) {
            no[i] = sc.nextInt();
         }

         // Initialize max and min with the first element of the array
         int max = no[0];
         int min = no[0];

         // Find max and min values in the array
         for (int i = 1; i < n; i++) {
            if (no[i] > max) {
               max = no[i]; // Update max
            }
            if (no[i] < min) {
               min = no[i]; // Update min
            }
         }

         // Print results
         System.out.println("Max number: " + max);
         System.out.println("Min number: " + min);

         sc.close();
}}