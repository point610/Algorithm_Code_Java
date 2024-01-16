package LeetCode.Middle.LeetCode90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode90
 * @Description TODO
 * @Author point
 * @Date 2023/10/27 22:54
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            DFS(nums, 0, i);
        }
        return list;
    }

    void DFS(int[] nums, int index, int size) {
        if (size == temp.size()) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            // 当前递归的函数不能排除第一个
            if (i > index && nums[i - 1] == nums[i]) {
                continue;
            }
            temp.add(nums[i]);
            // 递归时需要使用i 而不是index
            DFS(nums, i + 1, size);
            temp.remove(temp.size() - 1);
        }
    }
}

public class LeetCode90 {
}
