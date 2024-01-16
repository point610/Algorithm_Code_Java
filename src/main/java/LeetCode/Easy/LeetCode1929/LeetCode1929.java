package LeetCode.Easy.LeetCode1929;

/**
 * @ClassName LeetCode1929
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 13:39
 * @Version 1.0
 */
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i <  n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;

    }
}

public class LeetCode1929 {
}
