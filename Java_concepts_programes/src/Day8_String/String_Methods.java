package Java_concepts_programes.src.Day8_String;

import java.lang.module.FindException;

public class String_Methods {

    public static void main(String[] args) {

        //String s="welcome";

        // String s=new String("welcome");
        // System.out.println(s);

        //length()- length of the String
        String s = "welcome";

        int l = s.length();
        System.out.println(l);

        System.out.println(s.length());

        // Concat()- join String

        String s1 = "welcome";
        String s2 = "to java";
        String s3 = "uday ms";

        System.out.println(s1 + s2);

        System.out.println(s1.concat(s2));

        System.out.println(s1 + s2 + s3);

        System.out.println(s1.concat(s2).concat(s3));

        System.out.println("welcome" + "uday ms");

        //trim()-remove spaces from right and left side
        String a = " welcome ";


        System.out.println(a.trim());

        System.out.println("triming" + a.length());
        //CharAt()- returns a character based on index
        //index starts from 0

        s = "welcome";

        System.out.println(s.charAt(3));//c
        System.out.println(s.charAt(5));


        //contains()-returns true or false
        s = "welcome";

        System.out.println(s.contains("wel"));//wel
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("Come"));//false

        //equals(), equalsIgnorecase(0 -compare 2 strings
        //returns true/false

        s1 = "welcome";
        s2 = "welcome";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals("Welcome")); //false because 'w' is capitasl case sensitive
        System.out.println(s1.equalsIgnoreCase("welcome"));

        //replace() - replace single character/sequence of charecters in a string

        s="welcome to selenium";
         String n="python";
        System.out.println(s.replace('e', 's')); //wslcoms to sslsnim
        System.out.println(n.replace("python","c"));

        //substring()-extract substring from the main String

        s="welcome";
        System.out.println(s.substring(2,5));  //lco
        System.out.println(s.substring(1,3)); //wel

        //toUpperCase(- toLowercase() -converting case
        s="welcome";

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //split() -split/divide the struing in to multiple parts basedon delimeter
/*
 s="abc@xyz";

 String d[] =s.split("@");
 System.out.println(d[0]); //abc
 System.out.println(d[1]); //gmail.com
 */

//Ex2 -replace()

String amount="$,20,25,30"; //output :152055

        System.out.println(amount.replace("$","").replace(",","")); //152055

//Ex3
        s="abc,123@xyz"; //output abc,123,xyz

String a1[]=s.split(","); //abc, 123@xyz
System.out.println(a1[0]); //abc
System.out.println(a1[1]); //123@xyz

String a2[]=a1[1].split("@");
        System.out.println(a1[0]); //xyz
        System.out.println(a1[1]);//123

        //Ex5
        s="abc,123@xyz";

        System.out.println(s.split(",")[0]);
        System.out.println(s.split(",")[1].split("@")[0]);
        System.out.println(s.split(",")[1].split("@")[1]); //[abc,123,xyz]
        String name="john kenedy";
        System.out.println(name.contains("john")); //false
        System.out.println(name.toLowerCase().contains("john")); //true
        System.out.println(name.replace('j','j').contains("john"));
        System.out.println(name);
    }
}