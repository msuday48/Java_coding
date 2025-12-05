package Java_concepts_programes.src.Day22_Generics;

import java.util.ArrayList;

public class generic_programe1 {

    public static void main(String[] args)
    {
        /*
        Box <Almond> almondBox = new Box<>(10);
        almondBox.add(new Almond("california Almond"));
        almondBox.add(new Almond("california Almond"));
        almondBox.add(new Almond("India Almond"));
        almondBox.add(new Almond("NZ Almond"));

        System.out.println(almondBox.get(3));

        Box <cashew> cashewBox = new Box<>(5);
        cashewBox.add(new cashew("california Almond"));
        cashewBox.add(new cashew("california Almond"));
        cashewBox.add(new cashew("india Almond"));
        cashewBox.add(new cashew("NZ Almond"));
        cashewBox.add("hello world");

        System.out.println(((Almond) cashewBox.get(4)).name);

        ArrayList<String> list = new ArrayList<>();
        list.add("Yada");

        System.out.println(list.get(1).length());
    }*/


}

class Almond {
    String name;

    public Almond(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Almond [name= " + name + "]";
    }
}

class cashew {
    cashew[] almonds;
    String name;

    public cashew(String name) {
        this.name = name;
    }
}

class Box<T> {
  T[] dryFruits;
    int index;

    public Box(int size){
        dryFruits =  (T []) new Object[size];   // FIXED
        index = 0;
    }

    public void add(Object obj){       // FIXED
        dryFruits[index] = (T) obj;
        index++;
    }

    public Object get(int i){          // FIXED
        return dryFruits[i];
    }
}}