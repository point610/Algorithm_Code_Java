package CodeTop.TX.TX703;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private Queue<Integer> queue;
    private int size;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        size = k;

        if (nums == null) {
            return;
        }

        for (int iii : nums) {
            if (queue.size() < k) {
                queue.add(iii);
            } else {
                if (queue.peek() < iii) {
                    queue.poll();
                    queue.add(iii);
                }
            }
        }

    }

    public int add(int val) {
        if (queue.size() < size) {
            queue.add(val);
            return queue.peek();
        }
        if (queue.peek() < val) {
            queue.poll();
            queue.add(val);
        }

        return queue.peek();
    }
}

public class TX703 {
}
