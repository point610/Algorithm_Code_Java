package LeetCode.Easy.LeetCode1991;

/**
 * @ClassName LeetCode1991
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 0:50
 * @Version 1.0
 */
class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];

        for (int i = 1; i < size; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = size - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < size; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
}

public class LeetCode1991 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMiddleIndex(new int[]{1}));
    }
}
