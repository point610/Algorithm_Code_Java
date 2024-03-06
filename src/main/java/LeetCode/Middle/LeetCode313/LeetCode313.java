package LeetCode.Middle.LeetCode313;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        for (int i = 0; i < n - 1; i++) {
            int temp = queue.poll();
            for (int prime : primes) {
                //判断在范围内
                if (prime <= Integer.MAX_VALUE / temp) {
                    queue.add(prime * temp);
                }
                //为了防止同一丑数多次进队
                if (temp % prime == 0) {
                    break;
                }
            }

        }
        return queue.poll();
    }
}

public class LeetCode313 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
        System.out.println(solution.nthSuperUglyNumber(1, new int[]{2, 3, 5}));
    }
}
