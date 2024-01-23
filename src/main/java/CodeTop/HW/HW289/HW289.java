package CodeTop.HW.HW289;

class Solution {
    int row;
    int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private int get(int[][] ll, int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (!in(i, j)) {
                    continue;
                }
                if (!(i == x && j == y) && ll[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        row = board.length;
        col = board[0].length;
        int[][] ll = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = get(board, i, j);
                ll[i][j] = getnumber(temp, board[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = ll[i][j];
            }
        }
        return;
    }

    private int getnumber(int count, int one) {
        if (count < 2 || count > 3) {
            return 0;
        }
        if (one == 0 && count == 3) {
            return 1;
        }
        return one;
    }
}

public class HW289 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
    }
}
