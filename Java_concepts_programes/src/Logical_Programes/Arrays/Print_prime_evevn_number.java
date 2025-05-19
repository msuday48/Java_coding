package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Print_prime_evevn_number {

    public static void main(String[]args){

        int a[]={1,2,3,4,5};

        System.out.println("Even number in array...");

        for(int value:a){
            if(value%2==0)
                System.out.println(value);

        }
        System.out.println("odd numbers in array.....");
    }
}
