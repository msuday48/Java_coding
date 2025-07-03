package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Moving_all_zeros_to_LeftSide {

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 0, 6, 7};
        movezeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void movezeros(int[] nums) {
        int lastIndex = nums.length - 1;

        // Shift non-zero elements to the right
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[lastIndex] = nums[i];
                lastIndex--;
            }
        }

        // Fill remaining positions with zero
        for (int i = 0; i <= lastIndex; i++) {
            nums[i] = 0;
        }
    }
}
