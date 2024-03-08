package CodeTop.HW.HW354;

import java.util.*;

class Solution {
    private class Node {
        int width;
        int height;

        public Node(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });

        int size = envelopes.length;
        // 对宽度求LIS
        int[] www = new int[size];
        for (int i = 0; i < size; i++) {
            www[i] = envelopes[i][1];
        }

        return lengthOfLIS(www);
    }

    //public int lengthOfLIS(int[] temp) {
    //    int size = temp.length;
    //    int[] dp = new int[size];
    //    // 单个数字也为长度为1 的子序列
    //    Arrays.fill(dp, 1);
    //    int max = 1;
    //    for (int i = 1; i < size; i++) {
    //        for (int j = i - 1; j >= 0; j--) {
    //            if (temp[j] < temp[i]) {
    //                dp[i] = Math.max(dp[i], dp[j] + 1);
    //                max = Math.max(max, dp[i]);
    //            }
    //        }
    //    }
    //    return max;
    //}
    /* 返回 nums 中 LIS 的长度 */
    public int lengthOfLIS(int[] nums) {
        int piles = 0, n = nums.length;
        int[] top = new int[n];
        for (int i = 0; i < n; i++) {
            // 要处理的扑克牌
            int poker = nums[i];
            int left = 0, right = piles;
            // 二分查找插入位置
            while (left < right) {
                int mid = (left + right) / 2;
                if (top[mid] >= poker)
                    right = mid;
                else
                    left = mid + 1;
            }
            if (left == piles) piles++;
            // 把这张牌放到牌堆顶
            top[left] = poker;
        }
        // 牌堆数就是 LIS 长度
        return piles;
    }
}

public class HW354 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        System.out.println(solution.maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}}));

        System.out.println(solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println(solution.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
