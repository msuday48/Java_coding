package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

import java.util.Scanner;

public class SCanner_class {

    public static void main(String[]args){
        //Integer
        Scanner sc =new  Scanner(System.in);
        System.out.println("enter a number:");
      int a=sc.nextInt();
      System.out.println("give value"+a);

      //Decimal
        System.out.println("enter a decimal number");
        double num=sc.nextDouble();
        System.out.println("give decimal number" + num);

        //String
        System.out.println("enter your name:");
        String name=sc.next();
        System.out.println("your name is:"+ name);
    }
}
