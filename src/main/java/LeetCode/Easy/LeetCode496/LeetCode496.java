package LeetCode.Easy.LeetCode496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode496
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 22:10
 * @Version 1.0
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        Deque<Integer> stack = new ArrayDeque<>();

        int sizeTwo = nums2.length;
        for (int i = sizeTwo - 1; i >= 0; i--) {
            int temp = nums2[i];

            // 加入单调栈
            while (!stack.isEmpty() && temp >= stack.peek()) {
                stack.pop();
            }

            // 将num2中的数值加入map中
            map.put(temp, (stack.isEmpty() ? -1 : stack.peek()));
            stack.push(temp);
        }

        int sizeOne = nums1.length;
        int[] res = new int[sizeOne];
        for (int i = 0; i < sizeOne; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}

public class LeetCode496 {
}
