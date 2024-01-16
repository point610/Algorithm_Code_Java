package LeetCode.Easy.LeetCode703;

import java.util.*;

/**
 * @ClassName LeetCode703
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 1:01
 * @Version 1.0
 */
class KthLargest {
    int k;

    PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }
}

public class LeetCode703 {
}
