package LeetCode.Middle.LeetCode216;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> list;

    private void dfs(int k, int n, int startIndex, List<Integer> path) {
        if (path.size() == k && n == 0) {
            list.add(new ArrayList<>(path));
            return;
        }
        if (path.size() == k || n <= 0) {
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            dfs(k, n - i, i + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        list = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>());
        return list;
    }
}

public class LeetCode216 {
}
