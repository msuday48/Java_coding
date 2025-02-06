package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

import java.util.Scanner;

public class SearchingElementInArray {

    public static void main(String[]args) {

        int a[] = {10, 20, 30, 40, 50};
        Scanner sc=new Scanner(System.in);
System.out.println("enter number1");
        int search_num = sc.nextInt();
        boolean status=false;

        for (int i = 0; i <= 4; i++) {
            if (search_num == a[i]) {
                System.out.println("number found");
                status=true;
                break;
            }}
            if(status==false){
                System.out.println("Element not  found");
            }
        }
    }