package Java_concepts_programes.src.Day21_collections.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[]args){


                // Creating a LinkedHashMap
                LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

                // Inserting elements
                linkedHashMap.put(3, "Apple");
                linkedHashMap.put(1, "Banana");
                linkedHashMap.put(4, "Mango");
                linkedHashMap.put(2, "Grapes");

        // Printing using forEach (Java 8+)
        System.out.println("Using forEach:");
        for(int k:linkedHashMap.keySet()) {
            System.out.println(k+ " "+linkedHashMap.get(k));

            Iterator<Map.Entry<Integer, String>> it=linkedHashMap.entrySet().iterator();

            while(it.hasNext())
            {
                Map.Entry<Integer,String> entry=it.next();
                System.out.println(entry.getKey()+"     "+entry.getValue());
            }

            System.out.println(linkedHashMap.containsKey(2));
            System.out.println(linkedHashMap.containsValue("Banana"));
            linkedHashMap.clear();
            System.out.println(linkedHashMap.isEmpty());

        }
    }
}

