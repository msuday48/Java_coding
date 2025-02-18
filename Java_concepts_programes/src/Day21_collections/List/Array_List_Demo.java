package Java_concepts_programes.src.Day21_collections.List;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List_Demo {

    public static void main(String[]args) {
        //Declaration

        ArrayList mylist = new ArrayList();

        // List mylist=new ArrayList();

        // ArrayList <String>  mylist=new ArrayList<String>();

        //Adding data into arrayList

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(100);
        mylist.add(null);
        mylist.add(true);

        System.out.println(mylist.size()); //7

        //Remove element from arraylist
        mylist.remove(5);//here
        System.out.println(mylist);// [100, 10.5, welcome, A, 100, null]

        //insert element in the arraylist
        mylist.add(2,"java");

        //Modify element in the arraylist (modify/repace/change)
        mylist.add(2,"python");
       System.out.println("After insertion"+mylist);//[100,10.5,java.welcome,A,true,null]

        //Access specific element from arraylist
        mylist.get(3); //here 3 is index//welcom

        //reading all elements from arraylist

        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(1));
        }

        //Using enhanced for each loop
        for(Object x: mylist) {
            System.out.println(x);
        }

        //Using iterator
        Iterator <Object> it=mylist.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        //Checking all the elements from array list
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);

        mylist.removeAll(mylist2);

        System.out.println(mylist);

    }}