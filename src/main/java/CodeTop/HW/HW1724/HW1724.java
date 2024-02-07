package CodeTop.HW.HW1724;

import java.util.Arrays;

class Solution {
    private class Node {
        int left;
        int right;
        int max;

        public Node(int left, int right, int max) {
            this.left = left;
            this.right = right;
            this.max = max;
        }
    }

    public int[] getMaxMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int max = Integer.MIN_VALUE;
        int lux = 0;
        int luy = 0;
        int rdx = 0;
        int rdy = 0;


        for (int i = 0; i < row; i++) {
            // 以i为起始的矩阵
            int[] templll = new int[col];

            for (int j = i; j < row; j++) {
                // 当前j行的矩阵
                int[] currentRow = matrix[j];

                for (int k = 0; k < col; k++) {
                    templll[k] += currentRow[k];
                }

                // 调用函数求最大值
                Node node = getmaxarr(templll);
                if (max < node.max) {
                    max = node.max;
                    lux = i;
                    luy = node.left;
                    rdx = j;
                    rdy = node.right;
                }

            }
        }
        return new int[]{lux, luy, rdx, rdy};
    }

    private Node getmaxarr(int[] lll) {
        int left = 0;
        int right = 0;
        int max = lll[0];
        int size = lll.length;
        int[] dp = new int[size];
        int[] leftdp = new int[size];
        dp[0] = lll[0];
        for (int i = 1; i < size; i++) {
            if (lll[i] < dp[i - 1] + lll[i]) {
                dp[i] = dp[i - 1] + lll[i];
                leftdp[i] = leftdp[i - 1];
            } else {
                dp[i] = lll[i];
                leftdp[i] = i;
            }

            if (max < dp[i]) {
                max = Math.max(max, dp[i]);
                right = i;
                left = leftdp[i];
            }

        }
        return new Node(left, right, max);
    }
}

public class HW1724 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getMaxMatrix(new int[][]{{-1, 0}, {0, -1}})));
    }
}
