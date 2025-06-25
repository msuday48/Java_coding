package Java_concepts_programes.src.Logical_Programes.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arrays_duplicates_integers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] no = new int[n];

        // Taking input for the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            no[i] = sc.nextInt();
        }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(no[i]==no[j]){
                        System.out.println("Found Duplicate Element:" + no[i]);
                    }
                }
            }
                System.out.println("Duplicates not found");
      }
        }
