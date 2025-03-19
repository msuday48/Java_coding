package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Array_Reverse_number {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();

    int [] no = new int [5];

    for (int i=0;i<n;i++){
        no[i]=sc.nextInt();
    }

    for(int i=n-1;i>=0;i--){
        System.out.println(" reversed no : " + no[i]);
        }

}}