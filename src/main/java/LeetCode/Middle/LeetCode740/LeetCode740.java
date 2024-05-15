package LeetCode.Middle.LeetCode740;

import java.util.Arrays;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int size = Arrays.stream(nums).max().getAsInt();

        int[] list = new int[size + 1];

        for (int i = 0; i < nums.length; i++) {
            list[nums[i]] += nums[i];
        }

        int[] res = new int[size + 1];
        res[1] = list[1];
        for (int i = 2; i <= size; i++) {
            res[i] = Math.max(res[i - 1], res[i - 2] + list[i]); // 注意这里，不是res[i-1] + list[i]
        }

        return res[size];
    }
}

public class LeetCode740 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.deleteAndEarn(new int[]{3, 4, 2}));
        System.out.println(solution.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}
