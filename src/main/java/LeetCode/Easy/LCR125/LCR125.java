package LeetCode.Easy.LCR125;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LCR125
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:38
 * @Version 1.0
 */
class CQueue {
    Queue<Integer> queue;

    public CQueue() {
        queue = new LinkedList<>();
    }

    public void appendTail(int value) {
        queue.add(value);
    }

    public int deleteHead() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
}

public class LCR125 {
}
