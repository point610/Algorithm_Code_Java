package LeetCode.Middle.LeetCode802;

import java.util.*;

class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int size = graph.length;
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            edge.add(new ArrayList<>());
        }

        int[] chudu = new int[size];
        for (int i = 0; i < size; i++) {
            // i->j
            for (int j : graph[i]) {
                edge.get(j).add(i);
            }
            chudu[i] = graph[i].length;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (chudu[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int one = queue.poll();
            for (int i : edge.get(one)) {
                chudu[i]--;
                if (chudu[i] == 0) {
                    queue.add(i);
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (chudu[i] == 0) {
                res.add(i);
            }
        }

        Collections.sort(res);
        return res;
    }
}

public class LeetCode802 {
}
















