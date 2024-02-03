package CodeTop.HW.HW1235;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int size = startTime.length;
        int[][] jjj = new int[size][];
        for (int i = 0; i < size; i++) {
            jjj[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        // 按结束时间排序
        Arrays.sort(jjj, Comparator.comparingInt(one -> one[1]));
        int[] dp = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            int k = binarysearch(jjj, i - 1, jjj[i - 1][0]);
            // dp[i - 1]为不选的情况
            // dp[k] + jjj[i - 1][2]，为选了当前的节点，dp[k]为之前可以得到的最大值
            dp[i] = Math.max(dp[i - 1], dp[k] + jjj[i - 1][2]);
        }
        return dp[size];
    }

    // 找到节点的end比当前start早的节点的数量
    private int binarysearch(int[][] jjj, int right, int target) {
        int left = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (jjj[mid][1] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

public class HW1235 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jobScheduling(new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
        System.out.println(solution.jobScheduling(new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
        System.out.println(solution.jobScheduling(new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4}));
    }
}
