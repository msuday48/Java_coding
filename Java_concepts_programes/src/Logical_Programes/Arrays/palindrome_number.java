package Java_concepts_programes.src.Logical_Programes.Arrays;
import java.util.Scanner;
public class
palindrome_number {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

     int num= sc.nextInt();
     int rev=0;
     int org_num=rev;
     if(num!=0)
     {
         rev=rev*10+num%10;
         num=num/10;
     }
        if(org_num==rev){
           System.out.println(org_num+ "Palindromer Number");
        }
        else{
            System.out.println(org_num+" : not a palindrome number");
        }}}