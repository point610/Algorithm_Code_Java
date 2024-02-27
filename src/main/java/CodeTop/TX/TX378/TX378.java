package CodeTop.TX.TX378;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        // 在queue中加入一行的元素
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            queue.offer(new int[]{matrix[i][0], i, 0});
        }

        // 开始归并
        for (int i = 0; i < k - 1; i++) {
            int[] lll = queue.poll();
            // 不为最后一个
            if (lll[2] != size - 1) {
                queue.offer(new int[]{matrix[lll[1]][lll[2] + 1], lll[1], lll[2] + 1});
            }
        }
        return queue.peek()[0];
    }
}

public class TX378 {
}
