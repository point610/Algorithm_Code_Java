package LeetCode.Easy.LeetCode1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1018
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 15:37
 * @Version 1.0
 */
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int size = nums.length;
        int prefix = 0;
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            prefix = (prefix * 2 + nums[i]) % 5;
            res.add(prefix == 0);
        }
        return res;

    }
}

public class LeetCode1018 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.prefixesDivBy5(new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1});
        for (int i = 0; i < 10000; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}
