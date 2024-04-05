package LeetCode.Middle.LeetCode372;

import java.math.BigInteger;

class Solution {
    private int MOD = 1337;

    public int superPow(int a, int[] b) {
        if (a == 1) {
            return 1;
        }
        return dfs(a, b, b.length - 1);
    }

    private int dfs(int a, int[] b, int index) {
        if (index == -1) {
            return 1;
        }
        // index从后往前
        // 进阶的阶数为10
        return pow(a, b[index]) * pow(dfs(a, b, index - 1), 10) % MOD;
    }

    private int pow(int one, int two) {
        int res = 1;

        one = one % MOD;
        for (int i = 0; i < two; i++) {
            res = res * one % MOD;
        }
        return res;
    }
}

public class LeetCode372 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.superPow(2, new int[]{3}));
        System.out.println(solution.superPow(2147483647, new int[]{2, 0, 0}));
    }
}
