package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Missing_number_array {
    public static void main(String[] args) {
        /*
        Array should not have duplicates
        Array need not be sorted
        Values should be in range from 1 to N (here, N = 5)
        */

        int[] a = {1, 2, 4, 5};  // 3 is missing

        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];  // sum of array elements 12
        }

        int n = 5; // full range is 1l  to 5
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 += i;  // expected sum from 1 to 5  =15
        }

        System.out.println("Missing number in the array: " + (sum2 - sum1)); //12-15=3
    }
}
