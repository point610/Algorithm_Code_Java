package JavaGuide.hs.hs77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> temp;
    private List<List<Integer>> list;

    private void DFS(int index, int n, int k) {
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i <= n; i++) {
            temp.add(i);

            DFS(i + 1, n, k);

            temp.remove(temp.size() - 1);
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        temp = new ArrayList<>();

        DFS(1, n, k);

        return list;
    }
}

public class hs77 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
        System.out.println(solution.combine(1, 1));
    }
}
