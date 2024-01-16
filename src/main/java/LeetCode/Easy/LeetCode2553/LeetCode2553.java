package LeetCode.Easy.LeetCode2553;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2553
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:31
 * @Version 1.0
 */
class Solution {
    List<Integer> getlist(int n) {
        String temp = String.valueOf(n);
        int size = temp.length();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(temp.charAt(i) - '0');
        }
        return list;
    }

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            list.addAll(getlist(nums[i]));
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}

public class LeetCode2553 {
}
