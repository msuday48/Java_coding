package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

import java.util.Scanner;

public class Scannerclass_Taking_MultipleInputs {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");

        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2= sc.nextInt();

        System.out.println("sum of 2 numbers:"+(num1+num2));
    }
}