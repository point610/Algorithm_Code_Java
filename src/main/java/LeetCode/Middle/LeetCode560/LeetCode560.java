package LeetCode.Middle.LeetCode560;

/**
 * @ClassName LeetCode560
 * @Description TODO
 * @Author point
 * @Date 2023/11/14 22:45
 * @Version 1.0
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int temp = 0;
            for (int j = i; j < size; j++) {
                temp += nums[j];
                if (temp == k) {
                    sum++;
                }
            }
        }
        return sum;
    }
}

public class LeetCode560 {
}
