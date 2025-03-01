package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in) ;
System.out.println("Enter no");
        int num= sc.nextInt();

        int sum=0;
        while(num>0){

            sum=sum+num%10;
            num=num/10;
        }
System.out.println("sum of numbers : " + sum);
    }
}
