package LeetCode.Easy.LeetCode414;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode414
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 23:20
 * @Version 1.0
 */
class Solution {
    public int thirdMax(int[] nums) {
        int size = nums.length;

        Set<Long> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add((long) nums[i]);
        }
        Long[] longs = set.toArray(set.toArray(new Long[0]));
        size = longs.length;
        Arrays.sort(longs);
        if (size < 3) {
            return Math.toIntExact(longs[size - 1]);
        }
        return Math.toIntExact(longs[size - 3]);
    }
}

public class LeetCode414 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(new int[]{1, 2147483647, -2147483648}));
    }
}
