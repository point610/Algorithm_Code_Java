package CodeTop.HW.HW419;

class Solution {
    int count;
    private boolean[][] visit;
    int row;
    int col;
    char JIAN = 'X';

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(char[][] lll, int x, int y) {
        if (!in(x, y) || visit[x][y] || lll[x][y] != JIAN) {
            return;
        }
        visit[x][y] = true;
        DFS(lll, x - 1, y);
        DFS(lll, x, y - 1);
        DFS(lll, x, y + 1);
        DFS(lll, x + 1, y);
    }

    public int countBattleships(char[][] board) {
        count = 0;
        row = board.length;
        col = board[0].length;
        visit = new boolean[row][col];

        /*for (int i = 0; i < col; i++) {
            if (!visit[0][i] && board[0][i] == JIAN) {
                count++;
                DFS(board, 0, i);
            }
        }
        for (int i = 0; i < col; i++) {
            if (!visit[row - 1][i] && board[row - 1][i] == JIAN) {
                count++;
                DFS(board, row - 1, i);
            }
        }
        for (int i = 0; i < row; i++) {
            if (!visit[i][0] && board[i][0] == JIAN) {
                count++;
                DFS(board, i, 0);
            }
        }

        for (int i = 0; i < row; i++) {
            if (!visit[i][col - 1] && board[i][col - 1] == JIAN) {
                count++;
                DFS(board, i, col - 1);
            }
        }*/

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visit[i][j] && board[i][j] == JIAN) {
                    count++;
                    DFS(board, i, j);
                }
            }
        }

        return count;
    }
}

public class HW419 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
        System.out.println(solution.countBattleships(new char[][]{{'.', 'X', '.', '.', 'X'}, {'.', 'X', '.', '.', 'X'}, {'.', '.', '.', '.', 'X'}, {'X', '.', 'X', 'X', '.'}, {'X', '.', '.', '.', 'X'}}));
    }
}
