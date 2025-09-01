package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashSet;

public class Longest_Substring_withput_repeating {

        public static void main(String[] args) {
            // Input string to find the longest substring without repeating characters
            String str = "abcdab";

            // Call the method and store the result
            String result = longest(str);

            // Print the result
            System.out.println("Longest substring without repeating characters: " + result);
        }

        // Method to find the longest substring without repeating characters
        private static String longest(String str) {

            // HashSet to store unique characters in the current substring
            HashSet<Character> set = new HashSet<>();

            // Stores the longest substring found so far
            String longestOverall = "";

            // Stores the current substring being evaluated
            String longestTillnow = "";

            // Loop through each character in the input string
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i); // Get the current character

                // If the character is already in the set, it means repetition occurred
                if (set.contains(c)) {
                    // Check if the current substring is longer than the longest found so far
                    if (longestTillnow.length() > longestOverall.length()) {
                        longestOverall = longestTillnow; // Update the longest substring
                    }

                    // Reset the current substring and HashSet to start fresh
                    longestTillnow = "";
                    set.clear();
                }

                // Add the current character to the set and substring
                set.add(c);
                longestTillnow += c;
            }

            // Final check after the loop ends to ensure the last substring is considered
            if (longestTillnow.length() > longestOverall.length()) {
                longestOverall = longestTillnow;
            }

            // Return the longest substring without repeating characters
            return longestOverall;
        }
    }
