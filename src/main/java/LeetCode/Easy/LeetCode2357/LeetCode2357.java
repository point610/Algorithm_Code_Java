package LeetCode.Easy.LeetCode2357;

/**
 * @ClassName LeetCode2357
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:35
 * @Version 1.0
 */
class Solution {
    boolean isallzero(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int minimumOperations(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        int times = 0;
        int size = nums.length;
        while (!isallzero(nums)) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (nums[i] != 0) {
                    min = Math.min(min, nums[i]);
                }
            }
            // sub
            for (int i = 0; i < size; i++) {
                if (nums[i] != 0) {
                    nums[i] -= min;
                }
            }
            times++;
        }
        return times;
    }
}

public class LeetCode2357 {
}
