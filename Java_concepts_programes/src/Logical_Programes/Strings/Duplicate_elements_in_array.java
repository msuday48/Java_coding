package Java_concepts_programes.src.Logical_Programes.Strings;

public class Duplicate_elements_in_array {

    public static void main(String[] args) {
        String brr[] = {"javaprograme", "cac", "c++i", "python", "java"};
        String arr[] = {"c", "c++", "python", "java", "abc"};

        boolean flag = false;

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (brr[i]==arr[j]) {
                    System.out.println("Found Duplicate Element: " + brr[i]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Duplicates not found");
        }
    }
}
