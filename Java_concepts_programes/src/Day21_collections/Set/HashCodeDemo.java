package Java_concepts_programes.src.Day21_collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashCodeDemo {

    public static void main(String[]args){

 //Declaration
         /*Uses a HashMap internally
Does not maintain insertion order
Does not allow duplicate values
Allows null values (Only one null element)
Not synchronized (Not thread-safe)*/

        //HashSet myset=new HashSet();
        Set myset=new HashSet();
        //adding elements in to hashset

        //adding elements in to hashset
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(true);

//printing hashset
        System.out.println(myset);

        //Size of a Hahset
        System.out.println("Size ofmyset" +myset.size());
        //Removing element
        myset.remove(10.5); // 10.5 is value (not an index);
        System.out.println("After removing"+myset);

        //Inserting elemnt - not possible
        //ACess specific elemnt - Not possible

        //Convert Hashset-->

        ArrayList al = new ArrayList(myset);

        System.out.println();

        System.out.println(al);
        System.out.println(al.get(2));

        for(Object x:myset)
        {
            System.out.println(x);
        }

        //Using iterator
        Iterator <String> a=myset.iterator();//iterating only strings
        Iterator <Integer>b=myset.iterator();//iterating only integer
        Iterator <Object> it=myset.iterator(); //when list having both string and integer <object>in iterator will be used

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //clearing all the elements in hashset

    }
}
