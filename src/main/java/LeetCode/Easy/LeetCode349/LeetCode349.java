package LeetCode.Easy.LeetCode349;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName LeetCode349
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 23:54
 * @Version 1.0
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        one.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        two.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        one.retainAll(two);
        int[] res = one.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}

public class LeetCode349 {
}
