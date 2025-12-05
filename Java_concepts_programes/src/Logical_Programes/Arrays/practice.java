package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  System.out.println("enter no of element in nan array");
        int n1 = sc.nextInt();

        int[] no1 = new int[n1];

        System.out.println("enter elementa in an array" + n1);
        for (int i = 0; i < n1; i++) {
            no1[i] = sc.nextInt();
        }*/
        int num = 3;
        int count = 0;

        if (num > 1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
                if(count==0){
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
            }
        }
            }


        }



