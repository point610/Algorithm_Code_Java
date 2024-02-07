package CodeTop.HW.HW329;

class Solution {
    private int row;
    private int col;
    public int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        row = matrix.length;
        col = matrix[0].length;
        int aaa = 0;
        int[][] mem = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                aaa = Math.max(aaa, DFS(matrix, i, j, mem));
            }
        }

        return aaa;
    }

    private int DFS(int[][] matrix, int x, int y, int[][] mem) {
        if (mem[x][y] != 0) {
            return mem[x][y];
        }
        mem[x][y]++;
        for (int[] ddddd : dirs) {
            int nextx = ddddd[0] + x;
            int nexty = ddddd[1] + y;
            if (!in(nextx, nexty)) {
                continue;
            }

            int currentValue = matrix[x][y];
            int nextValue = matrix[nextx][nexty];

            if (currentValue < nextValue) {
                mem[x][y] = Math.max(mem[x][y], DFS(matrix, nextx, nexty, mem) + 1);
            }

        }
        return mem[x][y];
    }
}

public class HW329 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
        System.out.println(solution.longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}));
        System.out.println(solution.longestIncreasingPath(new int[][]{{1}}));
    }
}
