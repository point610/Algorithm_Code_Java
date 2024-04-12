package LeetCode.Middle.LeetCode417;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    private int row;
    private int col;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        row = heights.length;
        col = heights[0].length;
        Set<String> one = new HashSet<>();
        boolean[][] onebb = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            if (!onebb[i][0]) {
                dfs(heights, onebb, i, 0, one);
            }
        }
        for (int i = 0; i < col; i++) {
            if (!onebb[0][i]) {
                dfs(heights, onebb, 0, i, one);
            }
        }
        Set<String> two = new HashSet<>();
        boolean[][] twobb = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            if (!twobb[i][col - 1]) {
                dfs(heights, twobb, i, col - 1, two);
            }
        }
        for (int i = 0; i < col; i++) {
            if (!twobb[row - 1][i]) {
                dfs(heights, twobb, row - 1, i, two);
            }
        }
        // 求交集
        List<List<Integer>> ans = new ArrayList<>();
        for (String s : one) {
            if (two.contains(s)) {
                List<Integer> list = new ArrayList<>();
                String[] split = s.split("-");
                list.add(Integer.valueOf(split[0]));
                list.add(Integer.valueOf(split[1]));
                ans.add(list);
            }
        }
        return ans;
    }

    private boolean in(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    private void dfs(int[][] heights, boolean[][] visit, int x, int y, Set<String> set) {
        if (!in(x, y) || visit[x][y]) {
            return;
        }
        visit[x][y] = true;
        set.add(x + "-" + y);

        if (in(x - 1, y) && heights[x][y] <= heights[x - 1][y]) {
            dfs(heights, visit, x - 1, y, set);
        }
        if (in(x + 1, y) && heights[x][y] <= heights[x + 1][y]){
            dfs(heights, visit, x + 1, y, set);
        }
        if (in(x, y - 1) && heights[x][y] <= heights[x][y - 1]){
            dfs(heights, visit, x, y - 1, set);
        }
        if (in(x, y + 1) && heights[x][y] <= heights[x][y + 1]){
            dfs(heights, visit, x, y + 1, set);
        }
    }
}

public class LeetCode417 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pacificAtlantic(new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}}));
    }
}
