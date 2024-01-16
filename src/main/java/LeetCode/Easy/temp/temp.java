package LeetCode.Easy.temp;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName temp
 * @Description TODO
 * @Author point
 * @Date 2023/7/18 23:54
 * @Version 1.0
 */
class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Integer[] qindex = new Integer[queries.length];
        for (int i = 0; i < queries.length; i++) {
            qindex[i] = i;
        }
        Arrays.sort(qindex, (i, j) -> queries[i] - queries[j]);

        // 按left排序
        Arrays.sort(intervals, (i, j) -> i[0] - j[0]);

        // 按照区间的长度排序
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int[] res = new int[queries.length];
        Arrays.fill(res, -1);
        int i = 0;
        for (int qi : qindex) {
            while (i < intervals.length && intervals[i][0] <= queries[qi]) {
                // 队首元素为长度最小的区间
                pq.offer(new int[]{intervals[i][1] - intervals[i][0] + 1, intervals[i][0], intervals[i][1]});
                i++;
            }

            // 将right<queries[j]的元素移除
            while (!pq.isEmpty() && pq.peek()[2] < queries[qi]) {
                pq.poll();
            }

            // 最小的区间长度为优先队列的第一个
            if (!pq.isEmpty()) {
                res[qi] = pq.peek()[0];
            }
        }
        return res;
    }
}


public class temp {
}
