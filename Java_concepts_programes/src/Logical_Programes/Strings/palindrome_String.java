package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");

        String str = sc.nextLine();
        String org_str = str;
        String rev = "";

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {
            System.out.println(org_str + " is a palindrome string");
        } else
        {
            System.out.println(org_str + " is not a palindrome string");
        }}}