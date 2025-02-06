package Java_concepts_programes.src.Day11_Methods_Constructors.Constructors.Constructor_overloading;

public class BoxMain {

    public static void main(String[]args){

        //Box b=new Box();//1

        Box b=new Box (5.0,5.5,5.7);
        System.out.println(b.volume());
    }
}