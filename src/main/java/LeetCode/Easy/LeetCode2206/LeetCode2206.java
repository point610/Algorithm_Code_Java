package LeetCode.Easy.LeetCode2206;

/**
 * @ClassName LeetCode2206
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 23:02
 * @Version 1.0
 */
class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
        }

        for (int i = 1; i <= 500; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode2206 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.divideArray(new int[]{3, 2, 3, 2, 2, 2});
    }
}
