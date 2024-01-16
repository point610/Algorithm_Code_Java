package LeetCode.Easy.MS.MS0810;

/**
 * @ClassName MS0810
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 11:54
 * @Version 1.0
 */
class Solution {
    int row;

    int column;

    int currentcolor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.row = image.length;
        this.column = image[0].length;
        this.currentcolor = image[sr][sc];
        if (currentcolor == newColor) {
            return image;
        }
        DFS(image, sr, sc, newColor);
        return image;


    }

    private void DFS(int[][] image, int sr, int sc, int newColor) {
        if (!in(sr, sc)) {
            return;
        }

        if (image[sr][sc] == currentcolor) {
            image[sr][sc] = newColor;
            DFS(image, sr + 1, sc, newColor);
            DFS(image, sr - 1, sc, newColor);
            DFS(image, sr, sc + 1, newColor);
            DFS(image, sr, sc - 1, newColor);
        }
    }

    boolean in(int sr, int sc) {
        return 0 <= sr && sr < row && 0 <= sc && sc < column;
    }
}

public class MS0810 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1);
    }
}
