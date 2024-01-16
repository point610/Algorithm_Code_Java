package LeetCode.Middle.LeetCode739;

import java.util.Stack;

/**
 * @ClassName LeetCode739
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 12:47
 * @Version 1.0
 */
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            while (!stack.empty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (stack.empty()) {
                res[i] = 0;
            }  else {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        // for (int i = 0; i < size; i++) {
        //     System.out.print(res[i] + " ");
        // }
        return res;
    }
}

public class LeetCode739 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        solution.dailyTemperatures(new int[]{30,60,90});

    }
}
