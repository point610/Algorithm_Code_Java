package CodeTop.HW2.HW733;

class Solution {
    private int row;
    private int col;
    private boolean[][] visit;
    private int color;
    private int temp;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(int[][] img, int x, int y) {
        if (!in(x, y) || visit[x][y] || img[x][y] != temp) {
            return;
        }
        visit[x][y] = true;
        img[x][y] = color;
        DFS(img, x - 1, y);
        DFS(img, x, y - 1);
        DFS(img, x, y + 1);
        DFS(img, x + 1, y);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        row = image.length;
        col = image[0].length;
        this.color = color;
        visit = new boolean[row][col];
        temp = image[sr][sc];
        DFS(image, sr, sc);
        return image;
    }
}

public class HW733 {
}
