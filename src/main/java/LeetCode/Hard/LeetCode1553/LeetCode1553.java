package LeetCode.Hard.LeetCode1553;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Integer, Integer> memo = new HashMap<>();

    public int minDays(int n) {
        if (n <= 1) {
            return n;
        }
        Integer res = memo.get(n);
        if (res != null) { // 之前计算过
            return res;
        }
        // n % 2 和 n % 3 为为凑齐整除而溢出的部分
        res = Math.min(minDays(n / 2) + n % 2, minDays(n / 3) + n % 3) + 1;
        memo.put(n, res); // 记忆化
        return res;
    }
}

public class LeetCode1553 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDays(3));
        System.out.println(solution.minDays(10));
        System.out.println(solution.minDays(6));
        System.out.println(solution.minDays(1));
        System.out.println(solution.minDays(56));
        System.out.println(solution.minDays(61455274));
    }
}
