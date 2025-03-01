package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int rev=0;
    while (num!=0){
        rev=rev*10+num%10; //0+1234%10=4 40+3=43 430+2=432
        num=num/10; //1234/10=123  123/10=12 12/10=1

    }
    System.out.println("reverse number"+rev);
}}
