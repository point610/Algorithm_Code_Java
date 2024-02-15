package CodeTop.TX.TXLCR159;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] inventoryManagement(int[] stock, int cnt) {
        if (cnt == 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int ii : stock) {
            if (queue.size() < cnt) {
                queue.add(ii);
            } else {
                if (queue.peek() > ii) {
                    queue.poll();
                    queue.add(ii);
                }
            }
        }

        int[] list = new int[cnt];
        int index = 0;
        while (!queue.isEmpty()) {
            list[index++] = queue.poll();
        }
        return list;
    }
}

public class TXLCR159 {
}
