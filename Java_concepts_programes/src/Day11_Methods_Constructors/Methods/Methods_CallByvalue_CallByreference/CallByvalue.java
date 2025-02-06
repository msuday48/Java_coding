package Java_concepts_programes.src.Day11_Methods_Constructors.Methods.Methods_CallByvalue_CallByreference;

public class CallByvalue {

    public static void main(String[]args)
    {
     Test test=new Test();

     int number=100;
     System.out.println("Before Method" + number);

     test.m1(number);
     System.out.println("After method :" + number);

    }
}
