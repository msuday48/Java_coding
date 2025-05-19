package Java_concepts_programes.src.Logical_Programes.Strings;

public class remove_special_charecters {
    public static void main(String[]args)
    {
        String s="@#$%^&* latin string 0123456789";

      s=s.replaceAll("[a-zA-Z0-9]" , " ");

        System.out.println(s);
    }

}
