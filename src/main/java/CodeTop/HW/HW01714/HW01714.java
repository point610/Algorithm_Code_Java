package CodeTop.HW.HW01714;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName HW01714
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 12:11
 * @Version 1.0
 */
class Solution {
    public int[] smallestK(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int size = arr.length;
        int index = 0;
        for (int i = 0; i < k; i++) {
            queue.add(arr[index++]);
        }

        for (int i = index; i < size; i++) {
            if (queue.peek() >= arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        index = k - 1;
        int[] llll = new int[k];
        for (int i = index; i >= 0; i--) {
            llll[i] = queue.poll();
        }
        return llll;
    }
}

public class HW01714 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallestK(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
    }
}
