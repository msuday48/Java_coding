package Java_concepts_programes.src.Day6_Single_Dimension_Array;
import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main (String[]args){

         //Declaring array
        //add values into array
        // Find size of an array
        //read single value from array
        // read multiple values from an array


        //1)Declaring array
        //approach1:declaration
        /*int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
*/

        //Approach2
       // declaration+adding values into array
      int a[]={10,20,30,40,50};

        //3)Find size of an array
        System.out.println(a.length);//returns length(size) of an array 5

       // 4)Find single value from an array
         System.out.println(a[2]); //30
         System.out.println(a[0]);//10

        // 5)read multiple values from an array
       System.out.println(Arrays.toString(a));

        for(int i=0;i<a.length-1;i++)
        {
            System.out.println(i);//prints only array index  0 1 2 3
         System.out.println(a[i]);  //prints array values 10 20 30 40
    }

        //for each loop

        for (int value:a){
            System.out.println(value); //prints array values 10 20 30 40 50
        }
}}
