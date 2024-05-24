package LeetCode.Middle.LeetCode1673;

import java.util.Stack;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[k];

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && stack.peek() > nums[i] && size - i + stack.size() > k) {
                stack.pop();
            }
            stack.push(nums[i]);
        }

        while (stack.size() > k) {
            stack.pop();
        }

        int index = k - 1;
        while (!stack.isEmpty()) {
            res[index--] = stack.pop();
        }

        return res;
    }
}

public class LeetCode1673 {
}
