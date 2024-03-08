package CodeTop.MT.MT912;

import java.util.Arrays;
import java.util.Random;

class Solution {
    private Random random = new Random();

    private void sort(int[] nums, int left, int right) {
        if (left < right) {
            int index = partition(nums, left, right);
            sort(nums, left, index - 1);
            sort(nums, index + 1, right);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int temp = random.nextInt(right - left + 1) + left;
        int pivot = nums[temp];
        int lll = left;
        swap(nums, temp, lll);
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                lll++;
                swap(nums, lll, i);
            }
        }
        swap(nums, lll, left);
        return lll;
    }


    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
}

public class MT912 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 2, 3, 1})));
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }
}

