package LeetCode.Middle.LeetCode79;

/**
 * @ClassName LeetCode79
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 21:59
 * @Version 1.0
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // 方法的参数
    public boolean dfs(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }

        // 将错误的结果先返回
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
            return false;
        }
        if (word.charAt(k) != board[i][j]) {
            return false;
        }

        // 修改已经访问过的位置
        char t = board[i][j];
        board[i][j] = '0';

        // 递归，遍历四个方向
        boolean res = dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i, j - 1, k + 1);

        // 将修改过的重新改回来
        board[i][j] = t;
        return res;
    }
}

public class LeetCode79 {
}
