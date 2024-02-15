package CodeTop.TX.TXLCR125;

import java.util.LinkedList;
import java.util.Queue;

class CQueue {
    Queue<Integer> queue;

    public CQueue() {
        queue = new LinkedList<>();
    }

    public void appendTail(int value) {
        queue.offer(value);
    }

    public int deleteHead() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
}

public class TXLCR125 {
}
