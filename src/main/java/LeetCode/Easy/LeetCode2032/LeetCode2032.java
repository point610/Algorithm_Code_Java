package LeetCode.Easy.LeetCode2032;

import java.util.*;

/**
 * @ClassName LeetCode2032
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:26
 * @Version 1.0
 */
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new LinkedList<>();
        Set<Integer> one = new HashSet<>();
        Set<Integer> onetemp = new HashSet<>();
        Set<Integer> two = new HashSet<>();
        Set<Integer> three = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            one.add(nums1[i]);
            onetemp.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            two.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            three.add(nums3[i]);
        }
        onetemp.retainAll(two);
        one.retainAll(three);
        two.retainAll(three);
        onetemp.addAll(one);
        onetemp.addAll(two);
        Iterator<Integer> iterator = onetemp.iterator();
        while (iterator.hasNext()) {
            res.add(iterator.next());
        }
        return res;

    }
}

public class LeetCode2032 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.twoOutOfThree(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2});
    }
}
