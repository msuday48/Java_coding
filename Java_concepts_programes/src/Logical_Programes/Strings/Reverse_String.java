package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class Reverse_String {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();
            String org_str = str;

            // Use StringBuilder for better performance
            StringBuilder rev = new StringBuilder(str);
            rev.reverse();

            System.out.println("Reversed string: " + rev);

            // Correct way to check palindrome
            if (org_str.equals(rev.toString())) {
                System.out.println(org_str + " is a palindrome string.");
            } else {
                System.out.println(org_str + " is not a palindrome string.");
            }

            sc.close(); // Close the scanner to prevent memory leak
        }
    }
