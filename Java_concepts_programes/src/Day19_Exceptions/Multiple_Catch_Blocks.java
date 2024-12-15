package Java_concepts_programes.src.Day19_Exceptions;

public class Multiple_Catch_Blocks {

   public static void main(String[]args){

       System.out.println("programe is started");
String s= null;
try{
    System.out.println(s.length());
}
catch (Exception e){
        System.out.println("handled Arithmetic Exception");
}
/*
catch(NullPointerException e)
{
    System.out.println("handled Nullpointer Exception");
}

catch(NumberFormatException e){
    System.out.println("number format exception handeled");
}

 */
}}
