package LeetCode.Easy.LeetCode1275;

/**
 * @ClassName LeetCode1275
 * @Description TODO
 * @Author point
 * @Date 2023/9/13 10:48
 * @Version 1.0
 */
class Solution {
    static char[][] list = new char[3][3];


    static boolean AWin() {
        if (list[0][0] == 'X' && list[1][1] == 'X' && list[2][2] == 'X') {
            return true;
        }
        if (list[0][2] == 'X' && list[1][1] == 'X' && list[2][0] == 'X') {
            return true;
        }
        // row
        for (int i = 0; i < 3; i++) {
            if (list[i][0] == 'X' && list[i][1] == 'X' && list[i][2] == 'X') {
                return true;
            }
        }
        // column
        for (int i = 0; i < 3; i++) {
            if (list[0][i] == 'X' && list[1][i] == 'X' && list[2][i] == 'X') {
                return true;
            }
        }
        return false;
    }

    static boolean BWin() {
        if (list[0][0] == 'O' && list[1][1] == 'O' && list[2][2] == 'O') {
            return true;
        }
        if (list[0][2] == 'O' && list[1][1] == 'O' && list[2][0] == 'O') {
            return true;
        }
        // row
        for (int i = 0; i < 3; i++) {
            if (list[i][0] == 'O' && list[i][1] == 'O' && list[i][2] == 'O') {
                return true;
            }
        }
        // column
        for (int i = 0; i < 3; i++) {
            if (list[0][i] == 'O' && list[1][i] == 'O' && list[2][i] == 'O') {
                return true;
            }
        }
        return false;
    }

    public String tictactoe(int[][] moves) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = ' ';
            }
        }
        int size = moves.length;
        if (size <= 4) {
            return "Pending";
        }
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                // A
                list[moves[i][0]][moves[i][1]] = 'X';
            } else {
                // B
                list[moves[i][0]][moves[i][1]] = 'O';
            }
            if (AWin()) {
                return "A";
            }
            if (BWin()) {
                return "B";
            }
        }
        if (size==9) {
            return "Draw";
        }
        return "Pending";
    }
}

public class LeetCode1275 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.tictactoe(new int[][]{{1, 0}, {2, 2}, {2, 0}, {0, 1}, {1, 1}}));
    }
}
