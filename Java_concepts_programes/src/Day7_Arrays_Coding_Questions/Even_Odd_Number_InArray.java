package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

public class Even_Odd_Number_InArray {
    public static void main(String[]args){

       int a[]={11,20,33,40,50,60} ;

       int even=00;
       int odd=0;

       for(int value:a)
       {
       if (value%2==0)
       {
//
even++;
       }
       else{
           odd++;
       }
    }
       System.out.println("number of even numbers"+even);
        System.out.println("number of odd numbers"+odd);
}}
