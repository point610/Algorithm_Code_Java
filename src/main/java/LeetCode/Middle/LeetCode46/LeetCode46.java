package LeetCode.Middle.LeetCode46;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode46
 * @Description TODO
 * @Author point
 * @Date 2023/8/31 22:56
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    List<Integer> temp = new ArrayList<>();

    int size;

    public List<List<Integer>> permute(int[] nums) {
        size = nums.length;
        for (int i = 0; i < size; i++) {
            temp.add(nums[i]);
        }
        DFS(0);
        return res;
    }

    private void DFS(int x) {
        if (x == size - 1) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = x; i < size; i++) {
            int a = temp.get(i);
            temp.set(i, temp.get(x));
            temp.set(x, a);

            DFS(x + 1);

            a = temp.get(i);
            temp.set(i, temp.get(x));
            temp.set(x, a);
        }

    }
}

public class LeetCode46 {
}
