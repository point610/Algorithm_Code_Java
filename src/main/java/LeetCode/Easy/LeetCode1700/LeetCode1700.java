package LeetCode.Easy.LeetCode1700;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName LeetCode1700
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 15:08
 * @Version 1.0
 */
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int size = students.length;
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            stack.push(sandwiches[j]);
            queue.add(students[i]);
        }

        int repeattimes = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
                repeattimes = 0;
            } else {
                repeattimes++;
                int temp = queue.poll();
                queue.add(temp);
                if (repeattimes > queue.size()) {
                    return queue.size();
                }
            }
        }

        return 0;
    }
}

public class LeetCode1700 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});
    }
}
