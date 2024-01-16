package LeetCode.Easy.LCR042;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LCR042
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 22:05
 * @Version 1.0
 */
class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        int left = t - 3000;
        while (!queue.isEmpty() && queue.peek() < left) {
            queue.poll();
        }
        queue.add(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
public class LCR042 {
}
