package LeetCode.Easy.LeetCode1979;

/**
 * @ClassName LeetCode1979
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 0:26
 * @Version 1.0
 */
class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 100000;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        // 找最大公约数
        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

public class LeetCode1979 {
}
