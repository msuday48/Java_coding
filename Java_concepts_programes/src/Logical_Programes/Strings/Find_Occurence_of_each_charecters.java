package Java_concepts_programes.src.Logical_Programes.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static jdk.internal.icu.text.UTF16.getCharCount;

public class Find_Occurence_of_each_charecters {

    public static void getCharCount(String name) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] strArray = name.toCharArray();
for(char c:strArray)
if(charMap.containsKey(c)){
    charMap.put(c,charMap.get(c)+1);
}
else{
    charMap.put(c,1);
}

System.out.println(name+ " "+ charMap);
    }


    public static void main(String[]args){
    getCharCount("test")  ;
    }
}
