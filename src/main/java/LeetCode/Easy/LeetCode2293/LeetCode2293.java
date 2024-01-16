package LeetCode.Easy.LeetCode2293;

/**
 * @ClassName LeetCode2293
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:25
 * @Version 1.0
 */
class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n != 1) {
            int[] newNums = new int[n / 2];
            int i = 0;
            while (0 <= i && i < n / 2) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
                i++;
            }
            nums = newNums;
            n = nums.length;
        }
        return nums[0];
    }
}

public class LeetCode2293 {
}
