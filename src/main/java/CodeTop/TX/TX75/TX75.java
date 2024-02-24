package CodeTop.TX.TX75;

import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        // 找0
        int oneindex = 0;
        int twoindex = 0;
        int size = nums.length;
        while (twoindex < size) {
            if (nums[twoindex] == 0) {
                swap(nums, oneindex, twoindex);
                oneindex++;
            }
            twoindex++;
        }

        // 找1
        while (oneindex < size && nums[oneindex] == 1) {
            oneindex++;
        }
        twoindex = oneindex;
        while (twoindex < size) {
            if (nums[twoindex] == 1) {
                swap(nums, oneindex, twoindex);
                oneindex++;
            }
            twoindex++;
        }

        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}

public class TX75 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{0});
        solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        solution.sortColors(new int[]{2, 0, 1});
    }
}
