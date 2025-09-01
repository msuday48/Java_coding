package Java_concepts_programes.src.Day21_collections.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HastableDemo {

    public static void main(String []args){

        Hashtable hash=new Hashtable();//capacity is 11,load factor 0.75

//Hastable t=new Hashtable(intial capacity); //create hashtable object with some capacity

Hashtable <Integer,String> t=new Hashtable<Integer,String>();

t.put(101,"John");
t.put(102,"David");
t.put(103,"Smith");
//t.put(null,"X") //NullPointerExeption
//t.put(104,null); //NullPointerExeption

        System.out.println(t);
        System.out.println(t.get(103)); //smith

        t.remove(103);
        System.out.println(t);//(102=john, 102=David)

        System.out.println(t.containsKey(102));//true
        System.out.println(t.containsKey(105));//false

        System.out.println(t.keySet());//(102,101)
        System.out.println(t.values());//[David,john}

        for(int k:t.keySet()){
            System.out.println(k+" "+t.get(k));
        }

        for(Map.Entry entry:t.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        Set s=t.entrySet();

        Iterator itr=s.iterator();

        while(itr.hasNext()){
          Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());

        }
    }
}
