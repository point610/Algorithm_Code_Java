package LeetCode.Easy.LeetCode2996;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                sum += nums[i];
            }else {
                break;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int iii : nums) {
            set.add(iii);
        }

        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}

public class LeetCode2996 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingInteger(new int[]{4, 5, 6, 7, 8, 8, 9, 4, 3, 2, 7}));
        System.out.println(solution.missingInteger(new int[]{1, 2, 3, 2, 5}));
    }
}