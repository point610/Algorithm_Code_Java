package LeetCode.Easy.LeetCode661;

/**
 * @ClassName LeetCode661
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:26
 * @Version 1.0
 */
class Solution {
    int row;

    int column;

    boolean in(int r, int c) {
        return 0 <= r && r < row && 0 <= c && c < column;
    }

    int getaround(int r, int c, int[][] img) {
        int sum = 0;
        int times = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (in(i, j)) {
                    times++;
                    sum += img[i][j];
                }
            }
        }
        return (int) Math.floor(sum*1.0/times);
    }

    public int[][] imageSmoother(int[][] img) {
        this.row = img.length;
        this.column = img[0].length;
        int[][] res = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[i][j] =getaround(i, j, img);
            }
        }
        return res;
    }
}

public class LeetCode661 {
}
