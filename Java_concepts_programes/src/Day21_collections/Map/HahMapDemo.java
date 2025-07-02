package Java_concepts_programes.src.Day21_collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HahMapDemo {
public static void main(String[]args) {
/*Internally uses Hashing (similar to Hashtable in Java).
Not Synchronized (unlike Hashtable in Java) and hence faster for most of the cases.
Allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.
Duplicate Elements not allowed in HashMap, if you try to insert the duplicate key in HashMap, it will replace the element of the corresponding key.*/
    //declaration
    HashMap map = new HashMap();

    //Map hm=new HahMap();

    HashMap<Integer,String> hm=new HashMap<Integer,String>();

    //adding pairs
    hm.put(101,"john");
    hm.put(102,"Scott");
    hm.put(105,"mary");
    hm.put(104,"Scott");

    System.out.println(hm); //{101=john, 102=Scott, 104=Scott, 105=mary}
    System.out.println("After removing pair"+hm); //After removing pair{101=john, 102=Scott, 104=Scott, 105=mary}

    //get all the keys from hashmap
    System.out.println(hm.keySet()); //[101, 102, 104, 105]
    System.out.println(hm.values()); //[john, Scott, Scott, mary]
    System.out.println(hm.entrySet()); // [101=john, 102=Scott, 104=Scott, 105=mary]
    //access value of the key
    System.out.println(hm.get(102));

    //Reading data from hashmap
    //Using for each loop
    //get all the keys from hashmap

    for(int k:hm.keySet())
    {
   System.out.println(k+" "+hm.get(k));
    }
//
    Iterator<Map.Entry<Integer, String>> it=hm.entrySet().iterator();

    while(it.hasNext())
    {
        Map.Entry<Integer,String> entry=it.next();
        System.out.println(entry.getKey()+"     "+entry.getValue());
    }

    hm.clear();
    System.out.println(hm.isEmpty());
}}
