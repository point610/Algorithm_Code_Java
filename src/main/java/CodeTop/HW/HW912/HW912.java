package CodeTop.HW.HW912;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName HW912
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 19:51
 * @Version 1.0
 */
class Solution {
    private static final Random RANDOM = new Random();


    private void quicksort(int[] nums, int left, int right) {
        if (left<right){
            int pindex = partition(nums, left, right);
            quicksort(nums, left, pindex - 1);
            quicksort(nums, pindex + 1, right);
        }

    }

    private int partition(int[] nums, int left, int right) {
        int randomIndex = RANDOM.nextInt(right - left + 1) + left;
        swap(nums, left, randomIndex);

        int pivot = nums[left];
        // pivot的下标
        int ll = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                ll++;
                swap(nums, i, ll);
            }
        }
        swap(nums, left, ll);
        return ll;
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }

    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }
}

public class HW912 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 2, 3, 1})));
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }
}
