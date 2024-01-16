package LeetCode.Middle.LeetCode47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode47
 * @Description TODO
 * @Author point
 * @Date 2023/10/23 23:32
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    List<Integer> templist = new ArrayList<>();

    boolean[] visit;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        visit = new boolean[nums.length];
        DFS(nums, nums.length, 0);
        return list;

    }

    void DFS(int[] nums, int length, int index) {
        if (length == index) {
            list.add(new ArrayList<>(templist));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (visit[i]) {
                continue;
            }

            // visit[i-1]是为了检查是一个是否没有访问，为当前for所导致的
            if (i > 0 && !visit[i - 1] && nums[i] == nums[i - 1]) {
                continue;
            }

            visit[i] = true;
            templist.add(nums[i]);
            DFS(nums, length, index + 1);
            templist.remove(templist.size() - 1);
            visit[i] = false;

        }
    }
}

public class LeetCode47 {
}
