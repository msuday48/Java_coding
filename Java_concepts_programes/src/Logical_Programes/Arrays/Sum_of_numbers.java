package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in) ;
System.out.println("Enter array length");
        int n= sc.nextInt();
int [] num=new int[n];


        int sum=0;
        System.out.println("Enter array numbers");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            sum +=num[i];
        }



System.out.println("sum of numbers : " + sum);
    }
}
