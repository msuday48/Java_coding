package Java_concepts_programes.src.Day21_collections.Set;

import java.util.LinkedHashSet;

public class linked_Hashset_Demo {

    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(10);
        set.add("abc");
        set.add("null"); //one null will be allowed
        set.add(10);    //Duplicate, will not be added
        System.out.println(set);
}}
