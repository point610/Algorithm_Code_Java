package JavaGuide.hs.hs40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<Integer>> list;
    private List<Integer> temp;

    private void DFS(int[] candidates, int target, int index, int sum) {
        if (sum == target) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if (index >= candidates.length || sum > target) {
            return;
        }


        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            temp.add(candidates[i]);
            DFS(candidates, target, i + 1, sum + candidates[i]);
            temp.remove(temp.size() - 1);

        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        list = new ArrayList<>();
        temp = new ArrayList<>();

        DFS(candidates, target, 0, 0);

        return list;
    }
}

public class hs40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
        System.out.println(solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}
