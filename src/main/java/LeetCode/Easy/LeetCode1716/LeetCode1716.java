package LeetCode.Easy.LeetCode1716;

/**
 * @ClassName LeetCode1716
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 0:34
 * @Version 1.0
 */
class Solution {
    public int totalMoney(int n) {
        int zheng = n / 7;
        int mod = n % 7;

        return 28 * zheng + (zheng * zheng - zheng) / 2 * 7 + (mod * mod + mod) / 2 + zheng * mod;

    }
}

public class LeetCode1716 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalMoney(20));
    }
}
