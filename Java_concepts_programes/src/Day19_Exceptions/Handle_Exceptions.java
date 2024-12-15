package Java_concepts_programes.src.Day19_Exceptions;

import java.util.Scanner;

public class Handle_Exceptions {

    public static void main (String[]args){

System.out.println("Programe is started");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
/*
        int num = sc.nextInt( );

        try {
            System.out.println(100 / num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("invalid data");
            System.out.println(e.getMessage());
        }
 */
        //Example2
        int a[]=new int[5];

        System.out.println("Enter the position(0-4)");
        int pos=sc.nextInt();

        System.out.println("Enter the value");
        int value =sc.nextInt();

        try{
            a[pos]=value;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid position");
            e.getMessage();
        }
        System.out.println(a[pos]);
        System.out.println("programe complted");
    }
}