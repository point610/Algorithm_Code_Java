package LeetCode.Easy.LeetCode100222;

import java.util.Arrays;

class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        int one = nums[0];
        int two = nums[1];
        int three = nums[2];

        if (one == two && two == three) {
            return "equilateral";
        }
        if (one == two || one == three || two == three) {
            return "isosceles";
        }
        return "scalene";
    }
}

public class LeetCode100222 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.triangleType(new int[]{8, 4, 4}));
    }
}
