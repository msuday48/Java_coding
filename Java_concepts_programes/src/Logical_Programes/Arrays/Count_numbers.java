package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class Count_numbers {
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);

     System.out.println("enter array index number");

 int n=sc.nextInt();
 int [] no=new int[n];

     System.out.println("enter array numbers " + n);
 for (int i=0;i<n;i++){
     no[i]=sc.nextInt();
 }
 int sum=0 , count=0;

 for(int k:no){
    sum +=k;

  count++;
 }
     System.out.println("count of array elements : " + count);

 System.out.println("sum of array elements : "+sum);

}}