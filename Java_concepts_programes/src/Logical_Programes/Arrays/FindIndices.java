package Java_concepts_programes.src.Logical_Programes.Arrays;

public class FindIndices {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        int searchElement = 6; // Change this to test different values
        boolean found = false;

        System.out.print("Indices of element " + searchElement + ": ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.print(i + " ");
                found = true;
            }
        }
    }
}