package LeetCode.Middle.LeetCode72;

/**
 * @ClassName LeetCode72
 * @Description TODO
 * @Author point
 * @Date 2023/11/6 22:46
 * @Version 1.0
 */
class Solution {
    public int minDistance(String word1, String word2) {
        int onesize = word1.length();
        int twosize = word2.length();
        int[][] list = new int[onesize + 1][twosize + 1];
        for (int i = 0; i <= onesize; i++) {
            list[i][0] = i;
        }
        for (int i = 0; i <= twosize; i++) {
            list[0][i] = i;
        }

        for (int i = 1; i <= onesize; i++) {
            for (int j = 1; j <= twosize; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    list[i][j] = 1 + Math.min(list[i - 1][j - 1] - 1, Math.min(list[i - 1][j], list[i][j - 1]));
                } else {
                    list[i][j] = 1 + Math.min(list[i - 1][j - 1], Math.min(list[i - 1][j], list[i][j - 1]));
                }
            }
        }
        return list[onesize][twosize];
    }
}

public class LeetCode72 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minDistance("horse", "ros");
    }
}
