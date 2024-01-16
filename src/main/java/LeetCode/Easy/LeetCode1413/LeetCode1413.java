package LeetCode.Easy.LeetCode1413;

/**
 * @ClassName LeetCode1413
 * @Description TODO
 * @Author point
 * @Date 2023/9/25 0:00
 * @Version 1.0
 */
class Solution {
    public int minStartValue(int[] nums) {

        int min = Integer.MAX_VALUE;
        int size = nums.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            min = Math.min(min, sum);
        }
        if (min >= 0) {
            return 1;
        }
        return 1 - min;

    }
}

public class LeetCode1413 {

}
