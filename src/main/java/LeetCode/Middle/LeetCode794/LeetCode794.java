package LeetCode.Middle.LeetCode794;

class Solution {
    public boolean validTicTacToe(String[] board) {
        int one = 0;
        int two = 0;

        for (String s : board) {
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) == 'X') {
                    one++;
                }
                if (s.charAt(i) == 'O') {
                    two++;
                }
            }
        }
        return !((one != two && one - 1 != two) || (one - 1 != two && win(board, 'X')) || (one != two && win(board, 'O')));
    }

    private boolean win(String[] board, char c) {
        // 检查行
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == c && board[i].charAt(1) == c && board[i].charAt(2) == c) {
                return true;
            }
        }

        // 检查列
        for (int i = 0; i < 3; i++) {
            if (board[0].charAt(i) == c && board[1].charAt(i) == c && board[2].charAt(i) == c) {
                return true;
            }
        }

        // 检查对角线
        if (board[0].charAt(0) == c && board[1].charAt(1) == c && board[2].charAt(2) == c) {
            return true;
        }

        if (board[0].charAt(2) == c && board[1].charAt(1) == c && board[2].charAt(0) == c) {
            return true;
        }

        return false;
    }
}

public class LeetCode794 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validTicTacToe(new String[]{"XXX", "XOO", "OO "}));
    }
}
