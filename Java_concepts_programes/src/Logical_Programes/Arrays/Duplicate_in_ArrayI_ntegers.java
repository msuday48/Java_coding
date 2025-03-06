package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_in_ArrayI_ntegers {
    public static void main(String[] args) {

        int str[] = {1,2,3,3};

        Set<Integer> ss = new HashSet<Integer>();

        for (int st : str) {
            if (!ss.add(st)) {
                System.out.println("Duplicate element: " + st);
            }
        }
    }

}
