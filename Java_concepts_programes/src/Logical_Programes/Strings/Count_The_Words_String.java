package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class Count_The_Words_String {

    public static void main(String[] args) {

        System.out.println("Enter the String");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim(); // Remove leading/trailing spaces

        int count = 0;

        // If string is not empty after trimming
        if (!s.isEmpty()) {
            count = 1; // First word is assumed
            for (int i = 0; i < s.length() - 1; i++) {
                // If current character is space and next is not space, count a word
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }

        System.out.println("Number of words in the string: " + count);
        sc.close();
    }
}
