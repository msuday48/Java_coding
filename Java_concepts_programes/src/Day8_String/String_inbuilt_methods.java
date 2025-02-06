package Java_concepts_programes.src.Day8_String;

public class String_inbuilt_methods {

        public static void main(String[] args) {

            String str = "  Hello, Java Programming!  ";
            String str2 = "Hello, Java Programming!";
            String str3 = "java";

            // 1. length() - Returns the length of the string
            System.out.println("Length of str: " + str.length());  // Output: 27

            // 2. charAt(index) - Returns character at specified index
            System.out.println("Character at index 7: " + str.charAt(7));  // Output: J

            // 3. toUpperCase() - Converts string to uppercase
            System.out.println("Uppercase: " + str.toUpperCase());  // Output: HELLO, JAVA PROGRAMMING!

            // 4. toLowerCase() - Converts string to lowercase
            System.out.println("Lowercase: " + str.toLowerCase());  // Output: hello, java programming!

            // 5. trim() - Removes leading and trailing whitespaces
            System.out.println("Trimmed String: '" + str.trim() + "'");  // Output: 'Hello, Java Programming!'

            // 6. equals() - Compares two strings (case-sensitive)
            System.out.println("str equals str2: " + str.trim().equals(str2));  // Output: true

            // 7. equalsIgnoreCase() - Compares two strings ignoring case
            System.out.println("str3 equals 'JAVA' (ignore case): " + str3.equalsIgnoreCase("JAVA"));  // Output: true

            // 8. compareTo() - Compares two strings lexicographically
            System.out.println("Compare str3 to 'java': " + str3.compareTo("java"));  // Output: 0 (both are equal)
            System.out.println("Compare str3 to 'apple': " + str3.compareTo("apple"));  // Output: positive number

            // 9. substring(beginIndex) - Returns substring from given index
            System.out.println("Substring from index 7: " + str.substring(7));  // Output: Java Programming!

            // 10. substring(beginIndex, endIndex) - Returns substring between indexes
            System.out.println("Substring from 7 to 11: " + str.substring(7, 11));  // Output: Java

            // 11. contains() - Checks if the string contains a sequence
            System.out.println("Does str contain 'Java'? " + str.contains("Java"));  // Output: true

            // 12. startsWith() - Checks if string starts with specified prefix
            System.out.println("Does str start with 'Hello'? " + str.trim().startsWith("Hello"));  // Output: true

            // 13. endsWith() - Checks if string ends with specified suffix
            System.out.println("Does str end with 'Programming!'? " + str.trim().endsWith("Programming!"));  // Output: true

            // 14. indexOf() - Returns first index of specified character or substring
            System.out.println("First index of 'a': " + str.indexOf('a'));  // Output: 10

            // 15. lastIndexOf() - Returns last index of specified character or substring
            System.out.println("Last index of 'a': " + str.lastIndexOf('a'));  // Output: 19

            // 16. isEmpty() - Checks if the string is empty
            System.out.println("Is str empty? " + str.isEmpty());  // Output: false

            // 17. replace() - Replaces all occurrences of a character or substring
            System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));  // Output: Hello, Python Programming!

            // 18. replaceAll() - Replaces all occurrences using regex
            System.out.println("Replace all spaces with '-': " + str.replaceAll(" ", "-"));  // Output: --Hello,-Java-Programming!--

            // 19. split() - Splits string into array based on regex
            String[] words = str.trim().split(" ");
            System.out.println("Splitting the string:");
            for (String word : words) {
                System.out.println(word);  // Output: Hello,  Java  Programming!
            }

            // 20. join() - Joins array elements into a single string
            String joined = String.join("-", words);
            System.out.println("Joined String: " + joined);  // Output: Hello,-Java-Programming!

            // 21. toCharArray() - Converts string into character array
            char[] charArray = str.trim().toCharArray();
            System.out.print("Character Array: ");
            for (char c : charArray) {
                System.out.print(c + " ");  // Output: H e l l o ,   J a v a   P r o g r a m m i n g !
            }
            System.out.println();

            // 22. valueOf() - Converts different data types to string
            int number = 123;
            String numStr = String.valueOf(number);
            System.out.println("String value of number: " + numStr);  // Output: 123

            // 23. format() - Formats strings using placeholders
            String formatted = String.format("The number is: %d", number);
            System.out.println(formatted);  // Output: The number is: 123

            // 24. matches() - Checks if the string matches a regex
            System.out.println("Does str match regex '.*Java.*'? " + str.matches(".*Java.*"));  // Output: true

            // 25. intern() - Returns canonical representation of string
            String internedStr = str.intern();
            System.out.println("Interned String: " + internedStr);  // Output: Hello, Java Programming!

        }
}
