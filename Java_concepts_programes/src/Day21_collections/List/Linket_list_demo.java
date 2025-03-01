package Java_concepts_programes.src.Day21_collections.List;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linket_list_demo {

        public static void main(String[] args) {

            //LinkedList <Integer> l= new LinkedList<Integer>();
            // LinkedList<String> list = new LinkedList<>();

            LinkedList l = new LinkedList();

            //Add elementsd into linked list
            l.add(100);
            l.add("welcome");
            l.add(15.5);
            l.add('A');
            l.add(true);
            l.add(false);

            System.out.println(l);

            //remove
            l.remove(3);
System.out.println("After removing,new list"+l);

//Inserting/adding in the m8iddloe of linked list
            l.add(3,"Java");
            System.out.println("After removing, new list:"+l);

            //retriving value/object
            System.out.println(l.get(3));

            //change the value
            l.set(5,"x");
            System.out.println(l.contains("java")); //true
            System.out.println(l.contains("Python")); //false

            //isEmpty()
            System.out.println(l.isEmpty());

            for(Object e:l){
                System.out.println(e);
            }

            //iterator() method
            Iterator it=l.iterator();
            while(it.hasNext());
            {
                System.out.println(l);
            }

            //sort() collections.sort(collection

           System.out.println("Before sorting : "+ l);
            Collections.sort(l);
            System.out.println("After sorting"+l);

            //reverse order
            Collections.sort(l,Collections.reverseOrder());
            System.out.println("Reverse order : " +l);
        }}