package LeetCode.Easy.LeetCode1389;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode1389
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 22:08
 * @Version 1.0
 */
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}

public class LeetCode1389 {
}
