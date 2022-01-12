import java.util.Arrays;


public class selectionsortrecursive {
    public static void selectionSort(int[] nums) {
        helper(nums, 0);
    }

    public static void helper(int[] nums, int uIndex) {
        int swapIndex = findMin(nums, uIndex);
        if (swapIndex == -1) return;
            swap(nums, swapIndex, uIndex);
            helper(nums, uIndex + 1);
        
    }
    public static int findMin(int[] nums, int start) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        if (start == nums.length) return -1;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void swap(String[] args) {
        int [] nums = {3, 2 , 1, 6, 7, 5, 3, 4};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    

}
