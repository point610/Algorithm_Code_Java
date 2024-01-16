package LeetCode.Middle.LeetCode78;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode78
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 21:37
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        DFS(0, nums);
        return res;
    }

    void DFS(int index, int[] nums) {
        if (index == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // 加入当前元素之后
        temp.add(nums[index]);
        DFS(index + 1, nums);
        // 没有加入当前元素之后
        temp.remove(temp.size() - 1);
        DFS(index + 1, nums);

    }
}

public class LeetCode78 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subsets(new int[]{1, 2, 3});
    }
}
