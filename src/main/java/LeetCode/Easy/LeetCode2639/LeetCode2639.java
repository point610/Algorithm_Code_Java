package LeetCode.Easy.LeetCode2639;

/**
 * @ClassName LeetCode2639
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:28
 * @Version 1.0
 */
class Solution {
    int getlength(int n) {
        return String.valueOf(n).length();
    }

    public int[] findColumnWidth(int[][] grid) {
        int[] arrcol = new int[grid[0].length];
        int column = grid[0].length;
        int row = grid.length;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                arrcol[i] = Math.max(arrcol[i], getlength(grid[j][i]));
            }
        }
        return arrcol;
    }
}

public class LeetCode2639 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(-1));
    }
}
