package Java_concepts_programes.src.Day19_Exceptions;

public class UncheckedExceptions {
public static void main (String[]args){
 try {
        String ip = args[0];
        int a = Integer.parseInt(args[0]);
        int b = 10 / a;
    } catch (NumberFormatException exception) {
        exception.printStackTrace();
    } catch (ArithmeticException exception) {
        exception.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException exception) {
        exception.printStackTrace();
    }
}}



