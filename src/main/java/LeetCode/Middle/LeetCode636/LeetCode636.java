package LeetCode.Middle.LeetCode636;

import java.util.*;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        int currentTime = -1;
        for (String log : logs) {
            String[] split = log.split(":");
            int index = Integer.parseInt(split[0]), time = Integer.parseInt(split[2]);
            if (split[1].equals("start")) {
                if (!deque.isEmpty()) {
                    ans[deque.peekLast()] += time - currentTime;
                }
                deque.addLast(index);
                currentTime = time;
            } else {
                // 从栈中见元素退出，当在前一个环境下，为多个元素的间隙中时，也不会出错
                int func = deque.pollLast();
                // 结束的时候注意时间为空格进行计算
                ans[func] += time - currentTime + 1;
                currentTime = time + 1;
            }
        }
        return ans;
    }
}

public class LeetCode636 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6"))));
        System.out.println(Arrays.toString(solution.exclusiveTime(1, Arrays.asList("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"))));
    }
}
















