package CodeTop.HW.HW694;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private Set<String> set;
    private int row;
    private int col;
    private boolean[][] visit;

    private StringBuilder stringBuilder;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(int x, int y, int xx, int yy, int[][] ll) {
        if (!in(x, y) || visit[x][y] || ll[x][y] != 1) {
            return;
        }
        visit[x][y] = true;
        stringBuilder.append((x - xx)).append(y - yy);
        DFS(x + 1, y, xx, yy, ll);
        DFS(x, y + 1, xx, yy, ll);
        DFS(x - 1, y, xx, yy, ll);
        DFS(x, y - 1, xx, yy, ll);

    }

    public int numberofDistinctIslands(int[][] grid) {
        set = new HashSet<>();
        row = grid.length;
        col = grid[0].length;
        visit = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visit[i][j] && grid[i][j] == 1) {
                    stringBuilder = new StringBuilder();
                    DFS(i, j, i, j, grid);
                    set.add(stringBuilder.toString());
                }
            }
        }
        return set.size();
    }
}

public class HW694 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberofDistinctIslands(new int[][]{{1, 1, 0, 0, 1}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 1}, {0, 1, 0, 1, 1}}));
    }
}
