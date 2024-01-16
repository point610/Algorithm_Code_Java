package LeetCode.Middle.LeetCode200;

/**
 * @ClassName LeetCode200
 * @Description TODO
 * @Author point
 * @Date 2023/9/2 23:28
 * @Version 1.0
 */
class Solution {
    int row = 0;

    int column = 0;

    boolean[][] find = null;

    public int numIslands(char[][] grid) {
        row = grid.length;
        column = grid[0].length;
        find = new boolean[row][column];
        int number = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1' && !find[i][j]) {
                    number++;
                    DFS(i, j, grid);
                }
            }
        }
        return number;
    }

    private void DFS(int x, int y, char[][] grid) {
        if (x < 0 || x >= row || y < 0 || y >= column) {
            return;
        }
        if (grid[x][y] == '0' || find[x][y]) {
            return;
        }
        if (grid[x][y] == '1') {
            find[x][y] = true;
        }
        DFS(x - 1, y, grid);
        DFS(x + 1, y, grid);
        DFS(x, y - 1, grid);
        DFS(x, y + 1, grid);

    }
}

public class LeetCode200 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        });
    }
}
