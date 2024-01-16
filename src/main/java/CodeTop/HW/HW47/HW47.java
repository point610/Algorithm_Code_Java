package CodeTop.HW.HW47;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HW47
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 20:06
 * @Version 1.0
 */
class Solution {
    private List<List<Integer>> list;

    private boolean[] visit;

    private List<Integer> temp;

    private void DFS(int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                // 已经被访问过了
                continue;
            }

            // 排除上一个与当前的数据相同
            if (i > 0 && !visit[i - 1] && nums[i] == nums[i - 1]) {
                continue;
            }

            visit[i] = true;
            temp.add(nums[i]);
            DFS(nums);
            temp.remove(temp.size() - 1);
            visit[i] = false;

        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        visit = new boolean[nums.length];
        list = new ArrayList<>();
        temp = new ArrayList<>();
        Arrays.sort(nums);

        DFS(nums);
        return list;
    }
}

public class HW47 {
    public static void main(String[] args) {

    }
}
