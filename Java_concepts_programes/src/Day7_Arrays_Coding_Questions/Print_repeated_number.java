package Java_concepts_programes.src.Day7_Arrays_Coding_Questions;

public class Print_repeated_number {
    public static void main (String[]args){
    int a[] ={10,20,10,40,10,50,10};
    int num=10;

    int count=0;

    for (int value:a){

        if(value==num){
            count++;
        }
    }
System.out.println("number of times repeated : " + count);
}}
