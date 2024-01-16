package LeetCode.Easy.LeetCode1752;

/**
 * @ClassName LeetCode1752
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:58
 * @Version 1.0
 */
class Solution {
    public boolean check(int[] nums) {
        int startindex = -1;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i] < nums[i - 1]) {
                startindex = i;
                break;
            }
        }
        if (startindex == -1) {
            return true;
        }

        if (nums[0] < nums[size - 1]) {
            return false;
        }

        for (int i = startindex + 1; i < size; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;

    }
}

public class LeetCode1752 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.check(new int[]{2, 7, 4, 1, 2, 6, 2});
    }
}
