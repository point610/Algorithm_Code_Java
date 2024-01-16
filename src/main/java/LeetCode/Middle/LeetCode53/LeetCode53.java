package LeetCode.Middle.LeetCode53;

/**
 * @ClassName LeetCode53
 * @Description TODO
 * @Author point
 * @Date 2023/7/20 18:16
 * @Version 1.0
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int res = -10000;
        int size = nums.length;
        int max = -10000;
        for (int i = 0; i < size; i++) {
            res = Math.max(nums[i], nums[i] + res);
            max = Math.max(max, res);
        }
        return max;
    }
}

public class LeetCode53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }
}
