package CodeTop.HW.HW40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HW40
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 22:13
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list;

    void DFS(int[] candidates, int target, int index, int sum, List<Integer> lll) {
        if (sum == target) {
            list.add(new ArrayList<>(lll));
            return;
        }
        if (sum > target) {
            return;
        }
        if (index >= candidates.length) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            lll.add(candidates[i]);
            DFS(candidates, target, i + 1, sum + candidates[i], lll);
            lll.remove(lll.size() - 1);
        }


    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        list = new ArrayList<>();
        DFS(candidates, target, 0, 0, new ArrayList<>());

        return list;
    }
}

public class HW40 {
}
