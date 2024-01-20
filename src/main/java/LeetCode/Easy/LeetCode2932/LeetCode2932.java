package LeetCode.Easy.LeetCode2932;

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int size = nums.length;
        int max = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (one(nums[i], nums[j])) {
                    max = Math.max(max, nums[i] ^ nums[j]);
                }
            }
        }
        return max;
    }

    private boolean one(int oo, int tt) {
        return Math.abs(oo - tt) <= Math.min(oo, tt);
    }
}

public class LeetCode2932 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumStrongPairXor(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution.maximumStrongPairXor(new int[]{10, 100}));
        System.out.println(solution.maximumStrongPairXor(new int[]{5, 6, 25, 30}));
    }
}
