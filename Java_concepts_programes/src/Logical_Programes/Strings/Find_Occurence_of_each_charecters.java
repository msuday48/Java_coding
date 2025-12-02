package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Find_Occurence_of_each_charecters {

    // Method to count character occurrences
    public static void getCharCount(String name) {
        // Step 1: Create an empty HashMap to store character and their counts
        Map<Character, Integer> charMap = new HashMap<>();

        // Step 2: Convert the input string to a character array
        char[] strArray = name.toCharArray();  // e.g., "test" → ['t', 'e', 's', 't']

        // Step 3: Loop over each character in the array
        for (char c : strArray) {

            // Step 4: Check if the character 'c' is already in the map
            if (charMap.containsKey(c)) {
                // 👉 If it is already in the map:
                // Get the current count with charMap.get(c)
                // Add 1 to that count and put it back into the map
                // Example: if 't' is already counted once, we do → charMap.put('t', 1 + 1)
                charMap.put(c, charMap.get(c) + 1);
            } else {
                // 👉 If the character is not in the map:
                // This means it's the first time we've seen this character
                // So we add it to the map with count 1
                charMap.put(c, 1);
            }

            // 🔄 This process repeats for each character in the string
        }

        // Step 5: After the loop finishes, print the result
        // This prints the input string and the final map of character counts
        System.out.println(name + " " + charMap);
    }

    public static void main(String[] args) {
        // Start of program
        getCharCount("test");  // Call the method with input string "test"
        // Expected output: test {t=2, e=1, s=1}
    }
}
