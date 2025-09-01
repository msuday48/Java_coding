package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.Arrays;

public class String_Anagrams {

    public static void main(String[]args)
    {
        String name1="inch";
        String name2="chin";

        char[] c1=name1.toCharArray();
        char[] c2=name2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)==true){
            System.out.println("they are anagram");
        }
        else{
            System.out.println("they are not anagram");
        }

}}
