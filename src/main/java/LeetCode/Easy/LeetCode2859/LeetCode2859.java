package LeetCode.Easy.LeetCode2859;

import java.util.List;

/**
 * @ClassName LeetCode2859
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 22:38
 * @Version 1.0
 */
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int size = nums.size();
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (k == getNumberone(i)) {
                res += nums.get(i);
            }
        }
        return res;

    }

    int getNumberone(int n) {
        String str = Integer.toBinaryString(n);
        int size = str.length();
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode2859 {

}
