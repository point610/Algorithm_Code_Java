package LeetCode.Easy.LeetCode1175;

/**
 * @ClassName LeetCode1175
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 20:29
 * @Version 1.0
 */
class Solution {
    int MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        int zhiShu = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                zhiShu++;
            }
        }

        return (int) ((getRes(zhiShu) * getRes(n - zhiShu)) % MOD);
    }

    private long getRes(int i) {
        long res = 1;
        for (int j = 2; j <= i; j++) {
            res *= j;
            res %= MOD;
        }
        return res;
    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}

public class LeetCode1175 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numPrimeArrangements(100));
    }
}
