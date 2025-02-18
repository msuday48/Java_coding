package Java_concepts_programes.src.Logical_Programes;

public class Reverse_String {
    public static void main(String[]ARGS) {
        String str = "ABCD";
        String org_string=str;
        String rev = "";

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
    if(org_string==str){
        System.out.println(org_string+"palindrome string");
    }
    else{
        System.out.println(org_string+"is not palindrome String");
    }
    }
}