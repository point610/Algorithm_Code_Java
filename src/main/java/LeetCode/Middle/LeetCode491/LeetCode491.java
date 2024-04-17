package LeetCode.Middle.LeetCode491;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private List<List<Integer>> list;
    private Set<String> set;

    public List<List<Integer>> findSubsequences(int[] nums) {
        list = new ArrayList<>();
        set = new HashSet<>();
        dfs(new ArrayList<>(), nums, 0);
        return list;
    }

    private void dfs(List<Integer> temp, int[] nums, int index) {
        if (index == nums.length) {
            if (temp.size() >= 2 && !set.contains(temp.toString())) {
                set.add(temp.toString());
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        dfs(temp, nums, index + 1);

        if (temp.isEmpty()) {
            temp.add(nums[index]);
            dfs(temp, nums, index + 1);
            temp.remove(temp.size() - 1);
        } else {
            if (temp.get(temp.size() - 1) <= nums[index]) {
                temp.add(nums[index]);
                dfs(temp, nums, index + 1);
                temp.remove(temp.size() - 1);
            }
        }


    }

}

public class LeetCode491 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubsequences(new int[]{4, 6, 7, 7}));
        System.out.println(solution.findSubsequences(new int[]{4, 4, 3, 2, 1}));
    }
}




















