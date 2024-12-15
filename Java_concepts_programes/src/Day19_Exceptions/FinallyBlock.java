package Java_concepts_programes.src.Day19_Exceptions;

public class FinallyBlock {
    public static void main(String[]args){
        String s=null;

        try
        {
        System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception handeled..");
        }
        finally
        {
            System.out.println("entered into finally block...");
    }
}}
