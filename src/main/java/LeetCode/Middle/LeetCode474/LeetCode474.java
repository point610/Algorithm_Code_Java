package LeetCode.Middle.LeetCode474;

class Solution {
    private class Node {
        int zero, one;

        public Node(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int size = strs.length;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = getnode(strs[i]);
        }
        int[][][] dp = new int[size + 1][m + 1][n + 1];
        for (int i = 1; i <= size; i++) {
            Node node = nodes[i - 1];
            int zero = node.zero;
            int one = node.one;
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    // 赋初始值
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= zero && k >= one) {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - zero][k - one] + 1);
                    }
                }
            }
        }
        return dp[size][m][n];
    }

    private Node getnode(String one) {
        int size = one.length();
        int zero = 0;
        for (char cc : one.toCharArray()) {
            if (cc == '0') {
                zero++;
            }
        }
        return new Node(zero, size - zero);
    }
}

public class LeetCode474 {
}
