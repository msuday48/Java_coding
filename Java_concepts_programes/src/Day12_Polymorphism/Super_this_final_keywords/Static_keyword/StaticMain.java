package Java_concepts_programes.src.Day12_Polymorphism.Super_this_final_keywords.Static_keyword;

public class StaticMain {

    public static void main(String[] args)
    {
        //System.out.println(StaticDemo.a);
        StaticDemo.m1();

        StaticDemo sd=new StaticDemo();
        System.out.println(sd.b);
        sd.m2();

        sd.m();

    }

}
