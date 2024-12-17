package Java_concepts_programes.src.Day19_Exceptions;

public class Multiple_try_catch_finally {
    public static void main(String[]args){
        try{
            int a=10/10;
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
        finally{
            System.out.println("finally block executed 01");
        }
        try{
            int a=10/0;
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
        finally{
            System.out.println("finally block executed 02");
        }

        try{
            int a=10/20;
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
        finally{
            System.out.println("finally block executed 03");
        }
    }
}
