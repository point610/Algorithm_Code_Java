package LeetCode.Easy.LeetCode2928;

class Solution {
    public int distributeCandies(int n, int limit) {
        if (n > 3 * limit) {
            return 0;
        }
        return C(n + 2) - 3 * C(n - limit + 1) + 3 * C(n - 2 * limit) - C(n - 3 * limit - 1);
    }

    private int C(int one) {
        // 注意当下标小于1 时，返回0
        if (one <= 1) {
            return 0;
        }
        return (one) * (one - 1) / 2;
    }
}

public class LeetCode2928 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distributeCandies(5, 2));
        System.out.println(solution.distributeCandies(3, 3));

    }
}
