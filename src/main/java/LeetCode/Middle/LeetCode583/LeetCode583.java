package LeetCode.Middle.LeetCode583;

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] list = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            list[i][0] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            list[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    list[i][j] = list[i - 1][j - 1];
                } else {
                    list[i][j] = Math.min(list[i - 1][j - 1] + 2, Math.min(list[i - 1][j], list[i][j - 1]) + 1);
                    // 修改这里，从三个操作中选择最小的那个
                }
            }
        }
        return list[word1.length()][word2.length()];
    }
}

public class LeetCode583 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDistance("a", "b"));
        System.out.println(solution.minDistance("sea", "eat"));
        System.out.println(solution.minDistance("leetcode", "etco"));
    }
}
