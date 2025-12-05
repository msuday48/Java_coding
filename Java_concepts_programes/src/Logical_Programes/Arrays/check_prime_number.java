package Java_concepts_programes.src.Logical_Programes.Arrays;

public class check_prime_number {

    public static void main(String[] args) {

       // 1.Natural number>1
        //prime_number =which as only 2 factors 1 and itself and divisible by 1 and itself no
        //19-> 1 and 19 -> prime number
        //28 -> 1,2,4,7 -> Not a prime number

        int num = 3;
        int count = 0;

        if (num > 1) {  // Prime numbers are greater than 1
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {  // Prime number has exactly 2 factors: 1 and itself
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
