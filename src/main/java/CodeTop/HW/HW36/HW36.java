package CodeTop.HW.HW36;

class Solution {
    private boolean is(int[] ll) {
        for (int ii : ll) {
            if (ii >= 2) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            int[] ll = new int[9];
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                ll[board[i][j] - '1']++;
            }
            if (!is(ll)) {
                return false;
            }
        }
        for (int i = 0; i < row; i++) {
            int[] ll = new int[9];
            for (int j = 0; j < col; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                ll[board[j][i] - '1']++;
            }
            if (!is(ll)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!square(i, j, board)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean square(int x, int y, char[][] board) {
        int[] ll = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[x + i][y + j] == '.') {
                    continue;
                }
                ll[board[x + i][y + j] - '1']++;
            }

        }
        if (!is(ll)) {
            return false;
        }
        return true;
    }
}

//['.','.','.',     '.','5','.'    ,'.','1','.']
//['.','4','.',     '3','.','.'    ,'.','.','.'],
//['.','.','.',     '.','.','3'    ,'.','.','1'],
//
//['8','.','.',     '.','.','.'    ,'.','2','.'],
//['.','.','2',     '.','7','.'    ,'.','.','.'],
//['.','1','5',     '.','.','.'    ,'.','.','.'],
//
//['.','.','.',     '.','.','2'    ,'.','.','.'],
//['.','2','.',     '9','.','.'    ,'.','.','.'],
//['.','.','4',     '.','.','.'    ,'.','.','.']
public class HW36 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},

                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},

                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        }));
    }
}
