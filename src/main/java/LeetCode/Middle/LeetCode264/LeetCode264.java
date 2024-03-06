package LeetCode.Middle.LeetCode264;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 1; i < n; i++) {
            int temp = queue.poll();
            if (temp < Integer.MAX_VALUE / 2 && !set.contains(temp * 2)) {
                queue.add(temp * 2);
                set.add(temp * 2);
            }
            if (temp < Integer.MAX_VALUE / 3 && !set.contains(temp * 3)) {
                queue.add(temp * 3);
                set.add(temp * 3);
            }
            if (temp < Integer.MAX_VALUE / 5 && !set.contains(temp * 5)) {
                queue.add(temp * 5);
                set.add(temp * 5);
            }
        }
        return queue.poll();
    }
}

public class LeetCode264 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nthUglyNumber(1407));
        System.out.println(solution.nthUglyNumber(10));
        System.out.println(solution.nthUglyNumber(1));
    }
}
