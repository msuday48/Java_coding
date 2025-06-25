package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_sort_builtin_methods {

    public static void main(String[]args){

        Integer a[]={30,10,5,0,20};

        System.out.println("Arrays elemnts before sorting : " + Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
Arrays.sort(a);
        System.out.println("Arrays elemnts After sorting" + Arrays.toString(a));
    }
}
