package Java_concepts_programes.src.Logical_Programes.Arrays;
public class Moving_all_zeros_to_LeftSide {

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 3, 0, 6, 7};


        int[] nums2 = {1, 0, 3, 0, 6, 7};

        System.out.print("Original Array: ");
        for (int n : nums1) System.out.print(n + " ");
        System.out.println();

        // Move zeros to LEFT
        moveZerosLeft(nums1);
        System.out.print("Zeros Moved Left : ");
        for (int n : nums1) System.out.print(n + " ");
        System.out.println();

        // Move zeros to RIGHT
        moveZerosRight(nums2);
        System.out.print("Zeros Moved Right: ");
        for (int n : nums2) System.out.print(n + " ");
    }

    // ✅ Move all zeros to LEFT
    public static void moveZerosLeft(int[] nums) {
        int lastIndex = nums.length - 1;

        // Traverse from right to left, shifting non-zeros to the end
        for (int i = lastIndex; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[lastIndex] = nums[i];
                lastIndex--;
            }
        }

        // Fill remaining with zeros on left side
        for (int i = 0; i <= lastIndex; i++) {
            nums[i] = 0;
        }
    }

    // ✅ Move all zeros to RIGHT
    public static void moveZerosRight(int[] nums) {
        int firstIndex = 0;

        // Traverse from left to right, shifting non-zeros to the start
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[firstIndex] = nums[i];
                firstIndex++;
            }
        }

        // Fill remaining with zeros on right side
        for (int i = firstIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

