package LeetCode.Middle.LeetCode797;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> list;
    private int target;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        list = new ArrayList<>();
        target = graph.length;

        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(graph, 0, temp);

        return list;
    }

    private void dfs(int[][] graph, int index, List<Integer> temp) {
        if (index == target - 1) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < graph[index].length; i++) {
            temp.add(graph[index][i]);
            dfs(graph, graph[index][i], temp);
            temp.remove(temp.size() - 1);
        }

    }
}

public class LeetCode797 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
    }
}
