package LeetCode.Easy.LeetCode2176;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:58
 * @Version 1.0
 */
class Solution {
    public int countPairs(int[] nums, int k) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    sum++;
                }

            }
        }
        return sum;
    }
}

public class LeetCode2176 {
}
