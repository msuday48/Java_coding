package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class Reverse_String {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();
            String rev= "";
            String org_str = str;

            for(int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i);
            }

            System.out.println("Reversed string is : "+rev);

            if(org_str==rev){
            System.out.println("palindrome string");
            }

            else{
                System.out.println("not palindrome string");
            }

        }}