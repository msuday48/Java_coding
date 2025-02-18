package Java_concepts_programes.src.Day8_String;

public class EqualsVsDoubleEquals {

        public static void main(String[] args) {
            String s1 = new String("Java");
            String s2 = new String("Java");
            String s3 = "Java";
            String s4 = "Java";

            // Using '=='
            System.out.println(s1 == s2); // false (Different objects in heap)
            System.out.println(s3 == s4); // true (Both refer to the same string in the String Pool)

            // Using '.equals()'
            System.out.println(s1.equals(s2)); // true (Content is the same)
            System.out.println(s3.equals(s4)); // true (Content is the same)
        }
    }

