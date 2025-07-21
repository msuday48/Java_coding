package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Print_prime_evevn_number {

    public static void main(String[]args){

        int a[]={1,2,3,4,5};


        System.out.println("Even numbers in the array:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
            System.out.println("prime numbers in the array:");
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }



        /*System.out.println("Odd numbers in the array:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }*/
    }
}
