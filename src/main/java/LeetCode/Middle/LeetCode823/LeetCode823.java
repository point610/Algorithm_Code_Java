package LeetCode.Middle.LeetCode823;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    private long MOD = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);

        long res = 0;
        int size = arr.length;
        long[] dp = new long[size];
        for (int i = 0; i < size; i++) {
            dp[i] = 0;
            for (int left = 0, right = i - 1; left <= right; left++) {
                // 定位right
                while (left <= right && (long) arr[left] * arr[right] > arr[i]) {
                    right--;
                }

                if (right >= left && (long) arr[left] * arr[right] == arr[i]) {
                    if (right != left) {
                        dp[i] = (dp[i] + dp[left] * dp[right] * 2) % MOD;
                    } else {
                        dp[i] = (dp[i] + dp[left] * dp[right]) % MOD;
                    }
                }

            }
            res = (res + dp[i]) % MOD;
        }

        return (int) res;
    }
}

public class LeetCode823 {
}
