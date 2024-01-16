package LeetCode.Easy.LeetCode2824;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode2824
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 22:50
 * @Version 1.0
 */
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int size = nums.size();
        int[] array = nums.stream().mapToInt(Integer::valueOf).toArray();

        Arrays.sort(array);
        int res = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] < target) {
                    res++;
                } else {
                    break;
                }
            }
        }
        return res;

    }
}

public class LeetCode2824 {
}
