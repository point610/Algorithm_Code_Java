package LeetCode.Easy.LeetCode2239;

/**
 * @ClassName LeetCode2239
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:55
 * @Version 1.0
 */
class Solution {
    public int findClosestNumber(int[] nums) {

        int step = Integer.MAX_VALUE;
        int minnumber = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (Math.abs(nums[i]) < step) {
                step = Math.abs(nums[i]);
                minnumber = nums[i];
            }
            if (Math.abs(nums[i]) == step) {
                minnumber = Math.max(minnumber, nums[i]);
            }

            if (step == 0) {
                return nums[i];
            }

        }
        return minnumber;
    }
}

public class LeetCode2239 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.findClosestNumber(new int[]{2, -1, 1}));
    }
}
