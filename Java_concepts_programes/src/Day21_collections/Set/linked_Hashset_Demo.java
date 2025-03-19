package Java_concepts_programes.src.Day21_collections.Set;

import java.util.LinkedHashSet;

public class linked_Hashset_Demo {

    public static void main(String[] args) {
        /*Ordered: Maintains insertion order, meaning elements are stored in the order they were added.

Performance: Slightly slower than HashSet due to the overhead of maintaining the linked list, but still offers constant-time performance (O(1)) for basic operations.

Null Elements: Allows one null element.

Internal Implementation: Extends HashSet and uses a LinkedHashMap internally.*/
        LinkedHashSet set = new LinkedHashSet();
        set.add(10);
        set.add("abc");
        set.add("null"); //one null will be allowed
        set.add(10);    //Duplicate, will not be added
        System.out.println(set);
}}


/*int max=a[0];
		for(int i=1;i<a.length;i++)
        {
        if(a[i]>max)
        {
max=a[i];
        }
        }
        System.out.println("max of array value : "+ max);

// minimum
int b[ ]={50,10,40,2,60};

int min=b[0];

		for(int i=1;i<b.length;i++)
        {
        if(b[i]<min)
        {

min=b[i];
        }
        }
        System.out.println("max of array value : "+ min);*/