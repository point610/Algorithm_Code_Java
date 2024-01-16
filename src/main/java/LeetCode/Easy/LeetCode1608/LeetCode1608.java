package LeetCode.Easy.LeetCode1608;

/**
 * @ClassName LeetCode1608
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:29
 * @Version 1.0
 */
class Solution {
    public int specialArray(int[] nums) {
        int size = nums.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, nums[i]);
        }
        max = Math.min(100, max);
        for (int i = 1; i <= max; i++) {
            int largenumber = 0;
            for (int j = 0; j < size; j++) {
                if (nums[j] >= i) {
                    largenumber++;
                }
            }
            if (largenumber == i) {
                return i;
            }
        }
        return -1;
    }
}

public class LeetCode1608 {
}
