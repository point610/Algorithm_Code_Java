package LeetCode.Hard.LeetCode41;

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0 && !set.contains(nums[i])) {
                set.add(nums[i]);
                queue.add(nums[i]);
            }
        }
        int one = 1;
        while (!queue.isEmpty()) {
            if (queue.poll() == one) {
                one++;
            } else {
                return one;
            }
        }
        return one;
    }
}

public class LeetCode41 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(new int[]{0, 2, 2, 1, 1}));
        System.out.println(solution.firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(solution.firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(solution.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}
