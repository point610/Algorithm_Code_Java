package CodeTop.HW.HW39;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW39
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 15:41
 * @Version 1.0
 */
class Solution {
    private int[] candidates;

    private List<List<Integer>> list;

    void DFS(int index, int sum, int target, List<Integer> temp) {
        if (index >= candidates.length || sum > target) {
            return;
        }
        if (sum == target) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            DFS(i, sum + candidates[i], target, temp);
            temp.remove(temp.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        list = new ArrayList<>();
        DFS(0, 0, target, new ArrayList<>());
        return list;
    }
}

public class HW39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(solution.combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println(solution.combinationSum(new int[]{2}, 1));
    }
}
