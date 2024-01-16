package CodeTop.HW.HW547;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName HW547
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 9:48
 * @Version 1.0
 */
class Solution {


    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;
        boolean[] visit = new boolean[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            count++;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            while (!queue.isEmpty()) {
                int index = queue.poll();
                for (int j = 0; j < size; j++) {
                    if (isConnected[index][j] == 1 && !visit[j]) {
                        visit[j] = true;
                        queue.offer(j);
                    }
                }
            }

        }
        return count;
    }
}

public class HW547 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(solution.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }
}
