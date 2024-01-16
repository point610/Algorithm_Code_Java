package CodeTop.HW.HW733;

/**
 * @ClassName HW733
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 20:14
 * @Version 1.0
 */
class Solution {
    private boolean[][] visit;

    private int row;

    private int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(int[][] image, int x, int y, int color, int real) {
        if (!in(x, y)) {
            return;
        }
        if (image[x][y] != real || visit[x][y]) {
            return;
        }
        visit[x][y] = true;
        image[x][y] = color;
        DFS(image, x + 1, y, color, real);
        DFS(image, x - 1, y, color, real);
        DFS(image, x, y + 1, color, real);
        DFS(image, x, y - 1, color, real);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        row = image.length;
        col = image[0].length;
        visit = new boolean[row][col];
        DFS(image, sr, sc, color, image[sr][sc]);
        return image;

    }
}

public class HW733 {
}
