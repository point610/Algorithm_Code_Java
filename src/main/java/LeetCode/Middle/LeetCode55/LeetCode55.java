package LeetCode.Middle.LeetCode55;

/**
 * @ClassName LeetCode55
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 21:14
 * @Version 1.0
 */
class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        if (size <=1) {
            return true;
        }
        int maxIndex = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                maxIndex = Math.max(maxIndex, i + nums[i]);
                if (maxIndex >= size - 1) {
                    return true;
                }
            } else {
                if (maxIndex <= i) {
                    return false;
                }
            }
        }
        return true;

    }
}

public class LeetCode55 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
