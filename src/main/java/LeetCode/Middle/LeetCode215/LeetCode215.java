package LeetCode.Middle.LeetCode215;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName LeetCode215
 * @Description TODO
 * @Author point
 * @Date 2023/11/14 22:40
 * @Version 1.0
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < size; i++) {
            if (queue.size() < k) {
                queue.add(nums[i]);
            } else if (queue.peek() < nums[i]) {
                queue.remove();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
}

public class LeetCode215 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
