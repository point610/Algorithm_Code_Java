package LeetCode.Easy.LeetCode2562;

/**
 * @ClassName LeetCode2562
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:52
 * @Version 1.0
 */
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int size = nums.length;
        long sum = 0;
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                sum += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[size - 1 - i]));
            }
        } else {
            for (int i = 0; i < size / 2; i++) {
                sum += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[size - 1 - i]));
            }
            sum += nums[size / 2];
        }
        return sum;
    }
}

public class LeetCode2562 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheArrayConcVal(new int[]{5, 14, 13, 8, 12}));
    }
}
