package LeetCode.Middle.LeetCode764;

class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] list = new int[n][n];
        for (int[] mine : mines) {
            int x = mine[0];
            int y = mine[1];
            list[x][y] = 1;
        }
        int step = n / 2;


        for (int i = step; i >= 0; i--) {
            for (int j = i; j < n - i; j++) {
                for (int k = i; k < n - i; k++) {
                    if (can(j, k, list, i)) {
                        return i + 1;
                    }
                }
            }
        }
        return 0;
    }

    // x=2，step=2
    private boolean can(int x, int y, int[][] list, int step) {

        for (int i = x - step; i <= x + step; i++) {
            if (list[i][y] != 0) {
                return false;
            }
        }
        for (int i = y - step; i <= y + step; i++) {
            if (list[x][i] != 0) {
                return false;
            }
        }

        return true;
    }
}

public class LeetCode764 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.orderOfLargestPlusSign(2, new int[][]{{0, 0}, {0, 1}, {1, 0}}));
        System.out.println(solution.orderOfLargestPlusSign(5, new int[][]{{4, 2}}));
        System.out.println(solution.orderOfLargestPlusSign(1, new int[][]{{0, 0}}));
    }
}
