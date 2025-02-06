package Java_concepts_programes.src.Day21_collections.List;

import java.util.LinkedList;

public class Linket_list_demo {

        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.addFirst("Z");
            System.out.println(list); // Output: [Z, A, B]
            list.removeLast();
            System.out.println(list); // Output: [Z, A]
        }
    }
