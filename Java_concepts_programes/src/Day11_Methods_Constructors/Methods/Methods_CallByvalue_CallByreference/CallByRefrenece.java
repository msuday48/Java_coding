package Java_concepts_programes.src.Day11_Methods_Constructors.Methods.Methods_CallByvalue_CallByreference;

public class CallByRefrenece {
    public static void main(String[] args) {

        Test test=new Test();

        test.number=100;

        System.out.println("value before method"+test.number);

        test.m2(test);

        System.out.println("value of method:"+ test.number);
    }

}

