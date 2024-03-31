package LeetCode.Easy.LeetCode100272;

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) {
            return 1;
        }
        int size = nums.length;
        int[][] list = new int[size][size];
        for (int i = 0; i < size; i++) {
            list[i][i] = nums[i];
            if (list[i][i] >= k) {
                return 1;
            }
        }
        int min = 56;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                list[i][j] = nums[j] | list[i][j - 1];
                if (list[i][j] >= k) {
                    min = Math.min(min, j - i + 1);
                }
            }
        }
        return min == 56 ? -1 : min;
    }
}

public class LeetCode100272 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumSubarrayLength(new int[]{1, 12, 2, 5}, 43));
        System.out.println(solution.minimumSubarrayLength(new int[]{1, 2, 3}, 2));
        System.out.println(solution.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        System.out.println(solution.minimumSubarrayLength(new int[]{1, 2}, 0));

    }
}
