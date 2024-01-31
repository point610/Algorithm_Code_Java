package CodeTop.HW.HW215;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        int size = nums.length;
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        for (int iii : nums) {
            if (queue.size() == k) {
                if (queue.peek() < iii) {
                    queue.poll();
                    queue.offer(iii);
                }
            } else {
                queue.add(iii);
            }
        }
        return queue.peek();
    }
}

public class HW215 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{2,1}, 1));
        System.out.println(solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
