package CodeTop.HW.HW79;

/**
 * @ClassName HW79
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 21:42
 * @Version 1.0
 */
class Solution {
    private boolean sign;

    private boolean[][] visit;

    private int row;

    private int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(char[][] cc, String ss, int index, int x, int y) {

        if (index >= ss.length()) {
            sign = true;
            return;
        }
        if (!in(x, y) || visit[x][y] || cc[x][y] != ss.charAt(index)) {
            return;
        }
        visit[x][y] = true;

        DFS(cc, ss, index + 1, x + 1, y);
        DFS(cc, ss, index + 1, x, y + 1);
        DFS(cc, ss, index + 1, x - 1, y);
        DFS(cc, ss, index + 1, x, y - 1);
        visit[x][y] = false;
    }

    public boolean exist(char[][] board, String word) {
        sign = false;
        row = board.length;
        col = board[0].length;
        visit = new boolean[row][col];
        if (word.equals("")) {
            return true;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    DFS(board, word, 0, i, j);
                    if (sign) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

public class HW79 {
}
