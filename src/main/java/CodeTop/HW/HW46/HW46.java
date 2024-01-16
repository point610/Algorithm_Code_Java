package CodeTop.HW.HW46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HW46
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 16:28
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    void DFS(List<Integer> nums, int index) {
        if (index == nums.size() - 1) {
list.add(new ArrayList<>(nums));
            return;
        }

        for (int i = index; i < nums.size(); i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(index));
            nums.set(index, temp);

            DFS(nums, index + 1);

            temp = nums.get(i);
            nums.set(i, nums.get(index));
            nums.set(index, temp);
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for (int ii : nums) {
            temp.add(ii);
        }
        DFS(temp, 0);
        return list;
    }
}

public class HW46 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
        System.out.println(solution.permute(new int[]{0, 1}));
    }
}
