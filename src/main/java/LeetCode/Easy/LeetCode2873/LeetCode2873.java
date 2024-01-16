package LeetCode.Easy.LeetCode2873;

/**
 * @ClassName LeetCode2873
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 14:22
 * @Version 1.0
 */
class Solution {

    long getsum(int a, int b, int c) {
        return (long) (a - b) * c;
    }

    public long maximumTripletValue(int[] nums) {
        int size = nums.length;
        long max = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    max = Math.max(max, getsum(nums[i], nums[j], nums[k]));
                }
            }
        }
        return max;
    }
}

public class LeetCode2873 {
}
