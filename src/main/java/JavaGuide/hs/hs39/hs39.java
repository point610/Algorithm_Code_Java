package JavaGuide.hs.hs39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    private void DFS(int[] aaa, int index, int sum, int target) {
        if (index >= aaa.length || sum > target) {
            return;
        }

        if (sum == target) {
            list.add(new ArrayList<>(temp));
            return;
        }


        for (int i = index; i < aaa.length; i++) {
            temp.add(aaa[i]);
            // 这里传过去的 index 需要为 i
            DFS(aaa, i, sum + aaa[i], target);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        list = new ArrayList<>();
        temp = new ArrayList<>();

        DFS(candidates, 0, 0, target);

        return list;
    }
}

public class hs39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(solution.combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println(solution.combinationSum(new int[]{2}, 1));
    }
}
