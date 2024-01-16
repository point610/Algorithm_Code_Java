package LeetCode.Middle.LeetCode373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LeetCode373
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 1:39
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int oneSize = nums1.length;
        int twoSize = nums2.length;
        for (int i = 0; i < oneSize; i++) {
            for (int j = 0; j < twoSize; j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                list.add(temp);
            }
        }
        list.sort((Comparator.comparingInt(o -> (o.get(0) + o.get(1)))));
        if (list.size() > k) {
            return list.subList(0, k);
        }
        return list;
    }
}

public class LeetCode373 {
}
