package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_in_StringArray {
    public static void main(String[] args) {

        String str[] = {"java", "python", "selenium", "java"};

for(int i=0;i<str.length;i++)
{
    for(int j=i+1;j<str.length;j++){

        if (str[i].equals(str[j])) {
            System.out.println(str[i]);
            break; // break to avoid printing the same duplicate multiple times
        }
    }
}
    }
}

