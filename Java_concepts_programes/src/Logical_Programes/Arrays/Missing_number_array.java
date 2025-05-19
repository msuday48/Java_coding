package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Missing_number_array {

    public static void main(String[] args) {
    /*
    Array should not have duplicates
    Array No need to be sorted order
    Values should be in range
    */

        int a[] = {1, 2, 4, 5};

        //1+2+4+5=12 sum1
        //1+2+3+4+5=15

        //Sum2-sum1=15-12=3 missing

        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        int sum2=0;
        for(int i=1;i<5;i++){
            sum2=sum2+i;
        }

        System.out.println("sum of an array" + sum2);

        System.out.println("sum of an array" + (sum2-sum1));
    }
}