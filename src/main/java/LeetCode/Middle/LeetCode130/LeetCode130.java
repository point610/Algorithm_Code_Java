package LeetCode.Middle.LeetCode130;

/**
 * @ClassName LeetCode130
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 22:55
 * @Version 1.0
 */
class Solution {
    int row;

    int col;

    boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    void DFS1(char[][] board, int x, int y) {
        if (!in(x, y)) {
            return;
        }
        if (board[x][y] != 'O') {
            return;
        }
        board[x][y] = '1';
        DFS1(board, x - 1, y);
        DFS1(board, x + 1, y);
        DFS1(board, x, y - 1);
        DFS1(board, x, y + 1);
    }

    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        for (int i = 0; i < col; i++) {
            DFS1(board, 0, i);
            DFS1(board, row - 1, i);
        }
        for (int i = 0; i < row; i++) {
            DFS1(board, i, 0);
            DFS1(board, i, col - 1);
        }
        // 所有都为x
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        // 所有都为x
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }


    }
}

public class LeetCode130 {
}
