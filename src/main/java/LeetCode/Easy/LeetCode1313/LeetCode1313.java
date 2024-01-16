package LeetCode.Easy.LeetCode1313;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1313
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:00
 * @Version 1.0
 */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int times = nums[i];
            i++;
            int number = nums[i];
            for (int j = 0; j < times; j++) {
                list.add(number);
            }
        }
        //
        size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class LeetCode1313 {
}
