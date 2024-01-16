package LeetCode.Easy.LeetCode999;

/**
 * @ClassName LeetCode999
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 13:28
 * @Version 1.0
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        // 找车
        int row = board.length;
        int column = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    // 找后直接返回
                    int res = 0;
                    for (int k = x; k >= 0; k--) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'p') {
                            res++; break;
                        }
                    }
                    for (int k = x; k < row; k++) {
                        if (board[k][j] == 'B') {
                            break;
                        }
                        if (board[k][j] == 'p') {
                            res++; break;
                        }
                    }
                    for (int k = y; k >= 0; k--) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'p') {
                            res++; break;
                        }
                    }
                    for (int k = y; k < column; k++) {
                        if (board[i][k] == 'B') {
                            break;
                        }
                        if (board[i][k] == 'p') {
                            res++; break;
                        }
                    }
                    return res;
                }
            }
        }
        return 0;
    }
}

public class LeetCode999 {
}
