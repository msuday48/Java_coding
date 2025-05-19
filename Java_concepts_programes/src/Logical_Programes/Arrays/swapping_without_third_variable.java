package Java_concepts_programes.src.Logical_Programes.Arrays;

public class swapping_without_third_variable {

    public static void main(String[]args){

        int a=10 , b=20;

        System.out.println("Before swaping"+ a +" "+b);

     a=a+b; // 10+20=30
     b=a-b; //30-20=10
     a=a-b;  //30-20=10

        System.out.println("after swaping"+ a +" "+b);

    }
}
