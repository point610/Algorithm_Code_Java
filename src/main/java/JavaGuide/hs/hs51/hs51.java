package JavaGuide.hs.hs51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<String>> list;
    private char[][] temp;
    private int n;

    private void chartolist() {
        List<String> ssss = new ArrayList<>();
        for (char[] chars : temp) {
            ssss.add(new String(chars));
        }
        list.add(ssss);
    }

    private void DFS(int n, int row) {
        if (row == n) {
            chartolist();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (can(row, i)) {
                temp[row][i] = 'Q';
                DFS(n, row + 1);
                temp[row][i] = '.';
            }
        }

    }

    private boolean can(int x, int y) {
        // 竖
        for (int i = 0; i < x; i++) {
            if (temp[i][y] == 'Q') {
                return false;
            }
        }

        for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
            if (temp[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = x, j = y; i >= 0 && j < n; i--, j++) {
            if (temp[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    public List<List<String>> solveNQueens(int n) {
        list = new ArrayList<>();
        temp = new char[n][n];
        for (char[] chars : temp) {
            Arrays.fill(chars, '.');
        }
        this.n = n;

        DFS(n, 0);

        return list;
    }
}

public class hs51 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solveNQueens(4));
        System.out.println(solution.solveNQueens(1));
    }
}
