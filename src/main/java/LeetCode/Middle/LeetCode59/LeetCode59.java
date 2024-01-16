package LeetCode.Middle.LeetCode59;

/**
 * @ClassName LeetCode59
 * @Description TODO
 * @Author point
 * @Date 2023/10/25 22:35
 * @Version 1.0
 */
class Solution {
    boolean[][] visit;

    int size;

    boolean in(int x, int y) {
        return 0 <= x && x < size && 0 <= y && y < size && !visit[y][x];
    }

    public int[][] generateMatrix(int n) {
        this.size = n;
        int[][] list = new int[n][n];
        visit = new boolean[n][n];
        int index = 0;
        int all = n * n;
        int x = 0;
        int y = 0;
        while (index != all) {
            while (in(x, y)) {
                list[y][x] = index + 1;
                visit[y][x] = true;
                x++;
                index++;
            }
            x--;
            y++;
            while (in(x, y)) {
                list[y][x] = index + 1;
                visit[y][x] = true;
                y++;
                index++;
            }
            y--;
            x--;
            while (in(x, y)) {
                list[y][x] = index + 1;
                visit[y][x] = true;
                x--;
                index++;
            }
            x++;
            y--;
            while (in(x, y)) {
                list[y][x] = index + 1;
                visit[y][x] = true;
                y--;
                index++;
            }
            y++;
            x++;
        }
        return list;
    }
}

public class LeetCode59 {
}
