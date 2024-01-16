package LeetCode.Easy.LeetCode747;

/**
 * @ClassName LeetCode747
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 12:06
 * @Version 1.0
 */
class Solution {
    public int dominantIndex(int[] nums) {
        int size = nums.length;
        if (size < 1) {
            return -1;
        }
        if (size == 1) {
            return 0;
        }
        int oneIndex = 0;
        int one = -1;
        int twoIndex = 0;
        int two = -1;
        for (int i = 0; i < size; i++) {
            if (one < nums[i]) {
                oneIndex = i;
                one= nums[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (i != oneIndex && two< nums[i]) {
                twoIndex = i;
                two= nums[i];
            }
        }
        return nums[oneIndex] >= 2 * nums[twoIndex] ? oneIndex : -1;
    }
}

public class LeetCode747 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dominantIndex(new int[]{1, 0}));
    }
}
