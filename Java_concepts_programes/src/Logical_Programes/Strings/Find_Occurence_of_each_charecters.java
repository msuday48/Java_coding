package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Find_Occurence_of_each_charecters {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter arrayString");

        String userInput=sc.nextLine().toLowerCase().replace("\\s"," ");

        Map<Character,Integer> map=new HashMap<>();

        char[] ch=userInput.toCharArray();

        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
