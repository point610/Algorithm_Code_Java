package LeetCode.Easy.LeetCode3028;

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int current = 0;
        int count = 0;
        for (int ii : nums) {
            current += ii;
            if (current == 0) {
                count++;
            }
        }
        return count;
    }
}

public class LeetCode3028 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.returnToBoundaryCount(new int[]{2, 3, -5}));
        System.out.println(solution.returnToBoundaryCount(new int[]{3, 2, -3, -4}));
    }
}
