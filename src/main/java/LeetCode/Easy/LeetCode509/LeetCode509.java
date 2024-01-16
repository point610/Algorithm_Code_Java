package LeetCode.Easy.LeetCode509;

/**
 * @ClassName LeetCode509
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 22:11
 * @Version 1.0
 */
class Solution {
    public int fib(int n) {
        int[] temp = new int[31];
        temp[0] = 0;
        temp[1] = 1;
        if (n <= 1) {
            return temp[n];
        }
        for (int i = 2; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }
}

public class LeetCode509 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(0));
    }
}
