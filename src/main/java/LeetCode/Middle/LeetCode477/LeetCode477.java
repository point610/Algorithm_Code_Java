package LeetCode.Middle.LeetCode477;

class Solution {
    public int totalHammingDistance(int[] nums) {
        int size = nums.length;
        int res = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}

public class LeetCode477 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalHammingDistance(new int[]{4, 14, 2}));
        System.out.println(solution.totalHammingDistance(new int[]{4, 14, 4}));
        System.out.println(solution.totalHammingDistance(new int[]{4, 14, 4, 14}));

    }
}
