package LeetCode.Middle.LeetCode54;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode54
 * @Description TODO
 * @Author point
 * @Date 2023/10/24 22:43
 * @Version 1.0
 */
class Solution {
    int row;

    int col;

    boolean[][] visit;

    boolean in(int x, int y) {
        return 0 <= x && x < col && 0 <= y && y < row && !visit[y][x];
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        row = matrix.length;
        col = matrix[0].length;
        visit = new boolean[row][col];

        int size = row * col;
        int index = 0;
        int x = 0;
        int y = 0;
        while (index != size) {
            while (in(x, y)) {
                list.add(matrix[y][x]);
                visit[y][x]=true;
                x++;
                index++;
            }
            x--;
            y++;

            while (in(x, y)) {
                list.add(matrix[y][x]);
                visit[y][x]=true;
                y++;
                index++;
            }
            y--;
            x--;

            while (in(x, y)) {
                list.add(matrix[y][x]);
                visit[y][x]=true;
                x--;
                index++;
            }
            x++;
            y--;

            while (in(x, y)) {
                list.add(matrix[y][x]);
                visit[y][x]=true;
                y--;
                index++;
            }
            y++;
            x++;

        }
        return list;
    }
}

public class LeetCode54 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        solution.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
