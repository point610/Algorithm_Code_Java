package LeetCode.Easy.LeetCode1822;

/**
 * @ClassName LeetCode1822
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:24
 * @Version 1.0
 */
class Solution {
    public int arraySign(int[] nums) {
        int jishu = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                jishu++;
            }
        }
        if (jishu % 2 == 0) {
            return 1;
        }
        return -1;
    }
}

public class LeetCode1822 {
}
