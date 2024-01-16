package LeetCode.Easy.LeetCode1646;

/**
 * @ClassName LeetCode1646
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 13:12
 * @Version 1.0
 */
class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 1; i <= n; i++) {
            if (2 <= 2 * i && 2 * i <= n) {
                nums[2 * i] = nums[i];
            }
            if (2 <= (2 * i + 1) && (2 * i + 1) <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
        }
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

public class LeetCode1646 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getMaximumGenerated(3));
    }
}
