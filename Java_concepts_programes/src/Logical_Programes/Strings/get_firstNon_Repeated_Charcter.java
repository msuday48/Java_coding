package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class get_firstNon_Repeated_Charcter {

    public static void main(String[] args) {
        String str = "aabbdefb";

        char firstNonRepeated = getfirstNonRepeatedCharcter(str);
        System.out.println("First non-repeated character is: " + firstNonRepeated);

        char lastRepeated = getLastRepeatedCharcter(str);
        System.out.println("Last repeated character is: " + lastRepeated);
    }

    // Method for first non-repeated
    public static char getfirstNonRepeatedCharcter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("Didn't find any non-repeated character");
    }

    // Method for last repeated
    public static char getLastRepeatedCharcter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (countMap.get(ch) > 1) {
                return ch;
            }
        }

        throw new RuntimeException("Didn't find any repeated character");
    }
}