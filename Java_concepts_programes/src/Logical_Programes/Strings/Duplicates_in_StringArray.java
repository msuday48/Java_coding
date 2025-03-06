package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_in_StringArray {
    public static void main(String[] args) {

        String str[] = {"java", "python", "selenium", "java"};

        Set<String> ss = new HashSet<String>();

        for (String st : str) {
            if (!ss.add(st)) {  // Fixed missing closing parenthesis
                System.out.println("Duplicate element: " + st);
            }
        }
    }
}

