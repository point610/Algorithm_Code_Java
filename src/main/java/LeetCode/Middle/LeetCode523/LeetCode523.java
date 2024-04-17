package LeetCode.Middle.LeetCode523;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int size = nums.length;
        int[] list = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            list[i] = list[i - 1] + nums[i - 1];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= size; i++) {
            set.add(list[i - 2] % k);
            if (set.contains(list[i] % k)) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode523 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        System.out.println(solution.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println(solution.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
    }
}
