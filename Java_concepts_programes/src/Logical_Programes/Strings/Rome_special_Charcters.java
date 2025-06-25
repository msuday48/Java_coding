package Java_concepts_programes.src.Logical_Programes.Strings;

public class Rome_special_Charcters {

    public static void main(String[]args)
    {
        String s=" @#$%^&* Uday ms 3214569870.,;'";


        String result =" ";
int count=0;
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')){
                result +=ch;

                count++;
            }
        }
        System.out.println(count);
System.out.println(result);
    }
}
