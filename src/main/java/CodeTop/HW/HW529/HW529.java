package CodeTop.HW.HW529;

class Solution {
    private int row;
    private int col;

    private boolean in(int x, int y) {
        return (0 <= x && x < row) && 0 <= y && y < col;
    }

    private boolean islei(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return true;
        }
        return false;
    }

    int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
    int[] dirY = {1, 0, -1, 0, 1, -1, 1, -1};

    private void DFS(char[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int xx = x + dirX[i];
            int yy = y + dirY[i];
            if (!in(xx, yy)) {
                continue;
            }
            if (board[xx][yy] == 'M') {
                count++;
            }
        }

        if (count > 0) {
            // 可以结束遍历
            board[x][y] = (char) ('0' + count);
        } else {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                int xx = x + dirX[i];
                int yy = y + dirY[i];
                if (!in(xx, yy) || board[xx][yy] != 'E') {
                    continue;
                }
                DFS(board, xx, yy);
            }
        }
    }

    public char[][] updateBoard(char[][] board, int[] click) {
        if (islei(board, click)) {
            return board;
        }
        row = board.length;
        col = board[0].length;
        DFS(board, click[0], click[1]);
        return board;
    }
}

public class HW529 {
}
