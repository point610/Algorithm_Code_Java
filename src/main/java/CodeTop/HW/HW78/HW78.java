package CodeTop.HW.HW78;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW78
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 16:10
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        DFS(0, nums);
        return list;
    }

    private void DFS(int index, int[] nums) {
        if (index == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        DFS(index + 1, nums);
        temp.remove(temp.size() - 1);
        DFS(index + 1, nums);

    }
}

public class HW78 {
}
