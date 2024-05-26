package LeetCode.Middle.LeetCode1738;

import java.util.*;

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> templist = new ArrayList<>();

        int[][] list = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                list[i][j] = list[i - 1][j] ^ list[i][j - 1] ^ list[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                templist.add(list[i][j]);
            }
        }

        Collections.sort(templist, Collections.reverseOrder());
        return templist.get(k - 1);
    }
}

public class LeetCode1738 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 1));
        System.out.println(solution.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 2));
        System.out.println(solution.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 3));
        System.out.println(solution.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 4));

    }
}
