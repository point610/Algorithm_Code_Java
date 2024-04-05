package LeetCode.Middle.LeetCode375;

class Solution {
    private int[][] list;

    public int getMoneyAmount(int n) {
        list = new int[n + 10][n + 10];
        return dfs(1, n);
    }

    private int dfs(int left, int right) {
        if (left >= right) {
            return 0;
        }
        if (list[left][right] != 0) {
            return list[left][right];
        }
        int res = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            int temp = Math.max(dfs(left, i - 1), dfs(i + 1, right)) + i;
            res = Math.min(res, temp);
        }
        list[left][right] = res;
        return res;
    }
}

public class LeetCode375 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getMoneyAmount(10));
        System.out.println(solution.getMoneyAmount(1));
        System.out.println(solution.getMoneyAmount(2));
    }
}
