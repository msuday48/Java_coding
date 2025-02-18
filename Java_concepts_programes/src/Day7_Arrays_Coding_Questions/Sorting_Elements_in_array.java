package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

import java.util.Arrays;

public class Sorting_Elements_in_array {
    public static void main(String[]args){
        int a[]={100,300,200,700,500};
System.out.println("Before sorting:"+ Arrays.toString(a));
Arrays.sort(a);
System.out.println("After sorting:"+ Arrays.toString(a));

        //Strings sorting
        String b[]={"A,B,C,D,E,F"};
        System.out.println("Before sorting:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting:"+ Arrays.toString(a));
    }
}
