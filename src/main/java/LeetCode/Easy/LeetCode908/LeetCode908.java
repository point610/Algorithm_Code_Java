package LeetCode.Easy.LeetCode908;

/**
 * @ClassName LeetCode908
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 21:33
 * @Version 1.0
 */
class Solution {
    public int smallestRangeI(int[] nums, int k) {

        int size = nums.length;
        int min = 100000;
        int max = 0;

        for (int i = 0; i < size; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

        }
        return Math.max(0, max - min - 2 * k);
    }
}

public class LeetCode908 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.smallestRangeI(new int[]{9, 10, 0, 7}, 1);
    }
}
