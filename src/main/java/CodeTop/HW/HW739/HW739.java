package CodeTop.HW.HW739;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName HW739
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 20:45
 * @Version 1.0
 */
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stackindex = new Stack<>();
        int size = temperatures.length;
        int[] list = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            // 找到stack中比temp大的下标
            while (!stackindex.isEmpty() && temperatures[i] >= temperatures[stackindex.peek()]) {
                stackindex.pop();
            }
            if (stackindex.isEmpty()) {
                list[i] = 0;
            } else {
                list[i] = stackindex.peek() - i;
            }
            stackindex.add(i);
        }
        return list;
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
