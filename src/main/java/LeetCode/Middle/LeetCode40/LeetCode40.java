package LeetCode.Middle.LeetCode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode40
 * @Description TODO
 * @Author point
 * @Date 2023/10/22 23:40
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    List<Integer> templist = new ArrayList<>();

    void DFS(int[] candidates, int target, int sum, int index) {
        if (sum == target) {
            list.add(new ArrayList<>(templist));
            return;
        }
        if (index >= candidates.length) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[index] > target) {
                break;
            }
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            templist.add(candidates[i]);
            DFS(candidates, target, sum + candidates[i], i + 1);
            templist.remove(templist.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        DFS(candidates, target, 0, 0);
        return list;
    }
}

public class LeetCode40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
}
