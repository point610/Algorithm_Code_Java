package CodeTop.HW.HW55;


/**
 * @ClassName HW55
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 10:01
 * @Version 1.0
 */
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            int step = nums[i];
            int end = Math.max(0, i - step);
            for (int j = i; j >= end; j--) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[nums.length - 1];
    }
}

public class HW55 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{
                2, 3, 1, 1, 4
        })); System.out.println(solution.canJump(new int[]{
                3,2,1,0,4
        }));
    }
}
