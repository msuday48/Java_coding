package Java_concepts_programes.src.Logical_Programes.Arrays;
import java.util.Scanner;
public class
palindrome_number {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num%10;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);

        if (original == rev) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
        }

        sc.close();
    }
}