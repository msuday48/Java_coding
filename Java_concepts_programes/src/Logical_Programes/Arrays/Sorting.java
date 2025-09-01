package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Sorting {

    public static void printArray(int[] a) {

        //Assending sorted
        System.out.println(" sorting assending order");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

//Desending reverse array
        System.out.println(" ");
        System.out.println("reverse order : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }


        //Missing an array
        System.out.println(" ");
        System.out.println("missing number : ");
        int sum1=0;
        for (int i = 0; i <a.length; i++){
            sum1+=a[i];
        }
       int n=5;
        int sum2=0;
        for (int i = 1; i <=n; i++){
            sum2+=i;
        }

        System.out.println("missing number in array :" + (sum2-sum1));
    }
        public static void main (String args[]){
            int[] arr = {2,1,5,4};

            // bubble sort
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            printArray(arr);
        }
    }
