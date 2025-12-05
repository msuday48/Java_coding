package Java_concepts_programes.src.Logical_Programes.Strings;

public class String_immutablity_StringMemory {
    public static void main(String[] args) {

        String s1 = "Java";            // Stored in String Pool
        String s2 = "Java";            // Reuses from Pool
        String s3 = new String("Java");// New object in Heap + "Java" in Pool

        s1 = s1.concat(" Language");   // Creates new object "Java Language"

        System.out.println(s1); // Java Language (new object)
        System.out.println(s2); // Java (unchanged, pool object)
        System.out.println(s3); // Java (heap object, unchanged)

        System.out.println(s2 == s3);  // false (different heap and string pool memory)
        System.out.println(s2.equals(s3)); // true (content same)
        System.out.println(s1 == s2);  // true (same string pool  memory)
    }
}
