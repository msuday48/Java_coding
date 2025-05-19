package Java_concepts_programes.src.Logical_Programes.Strings;

public class ocurrence_each_charecter {

    public static void main(String[]args){

        String s="Java Programming Java oops";

        int totalcount= s.length();

        int total_count_afterRemove=s.replace("a","").length();

        int count=totalcount-total_count_afterRemove;

        System.out.println("Number occurances of a : " + count);
    }
}
