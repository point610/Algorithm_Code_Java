package LeetCode.Easy.LeetCode1800;

/**
 * @ClassName LeetCode1800
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:56
 * @Version 1.0
 */
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int temp = nums[i];
            while (i < size - 1 && nums[i] < nums[i + 1]) {
                temp += nums[i + 1];
                i++;
            }
            // i--;
            max = Math.max(max, temp);
        }
        return max;
    }
}

public class LeetCode1800 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
    }
}
