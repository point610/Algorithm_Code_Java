package CodeTop.TX.TX31;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {

        if (nums.length == 1) {
            return;
        }

        int size = nums.length;
        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                // 可以替换
                int tempindex = size - 1;
                while (nums[i] >= nums[tempindex]) {
                    tempindex--;
                }

                swap(nums, i, tempindex);

                Arrays.sort(nums, i + 1, size);

                return;
            }
        }

        int left = 0;
        int right = size - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}

public class TX31 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.nextPermutation(new int[]{1, 3, 2});
        solution.nextPermutation(new int[]{1, 2, 3});
        solution.nextPermutation(new int[]{3, 2, 1});
        solution.nextPermutation(new int[]{1, 1, 5});
    }
}
