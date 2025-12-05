package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;


public class palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");

        String str = sc.nextLine();
        String pal_string = str;

        StringBuilder rev = new  StringBuilder(str);
        rev.reverse();
        rev.toString();

        if (pal_string.equals(rev)){
            System.out.println("palindrome string : "+pal_string);
        }
else{
    System.out.println("not -palindrome string : "+ pal_string);
        }
    }}