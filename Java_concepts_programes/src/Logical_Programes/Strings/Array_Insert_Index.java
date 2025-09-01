package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class Array_Insert_Index {

    public static void main(String[]args){

        int [] arr=new int[5];

        System.out.println("Enter the le,ents");

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length-1;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("printing elements before insert");

        for(int i :arr){
            System.out.println(i);
        }

        System.out.println(" enter the location at which we want to insert");

        int location=sc.nextInt();

        System.out.println(" enter the number which you want to insert");

        int value=sc.nextInt();

        for (int i=arr.length-1;i>location;i--){
        arr[i]=arr[i-1];
        }

        arr[location] = value;
        for(int i:arr){
            System.out.println(i);
        }
    }
}
