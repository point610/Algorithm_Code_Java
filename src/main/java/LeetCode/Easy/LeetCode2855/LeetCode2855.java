package LeetCode.Easy.LeetCode2855;

import java.util.List;

/**
 * @ClassName LeetCode2855
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 23:53
 * @Version 1.0
 */
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int size = nums.size();
        int countDown = 0;
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                countDown++;
                index = i;
            }
        }
        if (countDown >= 2) {
            return -1;
        }
        if (countDown == 0) {
            return 0;
        }
        if (nums.get(0) < nums.get(size - 1)) {
            return -1;
        }
        return size - 1 - index;
    }
}

public class LeetCode2855 {
}
