package Java_concepts_programes.src.Logical_Programes.Arrays;

import java
        .util.Scanner;


public class LinearSearch {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of array : ");

        int n = sc.nextInt();

        int no[] = new int[n];

        int search_ele = 100;

        boolean flag = false;
System.out.println("enter array elements : "+ n);
        for (int i = 0; i < n; i++) {
       no[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){

            if(search_ele==no[i]){
                System.out.println("Element found : "+no[i]);
                flag=true;
                break;
            }
        }
        if (flag == false) {

            System.out.println("Element not found");
        }
    }
}
