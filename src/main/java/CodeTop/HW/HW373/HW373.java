package CodeTop.HW.HW373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @ClassName HW373
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 11:47
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        int onesize = nums1.length;
        int twosize = nums2.length;

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (nums1[o1[0]] + nums2[o1[1]]) - (nums1[o2[0]] + nums2[o2[1]]);
            }
        });

        for (int i = 0; i < Math.min(onesize, k); i++) {
            // 需要加的是下标
            queue.add(new int[]{i, 0});
        }
        List<List<Integer>> list = new ArrayList<>();
        while (k-- > 0 && !queue.isEmpty()) {
            int[] temp = queue.poll();
            int one = temp[0];
            int two = temp[1];

            List<Integer> llll = new ArrayList<>();
            llll.add(nums1[one]);
            llll.add(nums2[two]);
            list.add(llll);

            if (two + 1 < twosize) {
                queue.offer(new int[]{one, two + 1});
            }

        }
        return list;
    }
}

public class HW373 {
}
