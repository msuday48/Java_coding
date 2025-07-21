package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class Reverse_Each_Word_Ina_String {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        String[] words=str.split(" ");

        String reverseString=" ";

        for(String s:words){
            String rev="";

            for(int i=s.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);
            }
            reverseString=reverseString+rev+" ";
        }

System.out.println(reverseString);
    }
}
