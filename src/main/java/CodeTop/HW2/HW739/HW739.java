package CodeTop.HW2.HW739;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int size = temperatures.length;
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (temperatures[stack.peek()] > temperatures[i]) {
                    res[i] = stack.peek() - i;
                    stack.push(i);
                } else {
                    while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                        stack.pop();
                    }
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        res[i] = stack.peek() - i;
                        stack.push(i);
                    }
                }
            }
        }
        return res;
    }
}

public class HW739 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{30, 60, 90})));
    }
}
