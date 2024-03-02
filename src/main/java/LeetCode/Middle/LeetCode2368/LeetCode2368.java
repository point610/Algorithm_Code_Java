package LeetCode.Middle.LeetCode2368;

import java.util.*;

class Solution {
    private Set<Integer> nno;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        nno = new HashSet<>();
        for (int iii : restricted) {
            nno.add(iii);
        }

        List<List> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList());
        }

        for (int[] iii : edges) {
            int one = iii[0];
            int two = iii[1];

            list.get(one).add(two);
            list.get(two).add(one);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[n];
        visit[0] = true;
        int res = 0;
        queue.add(0);
        while (!queue.isEmpty()) {
            Queue<Integer> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                int index = queue.poll();
                res++;
                List<Integer> temp = list.get(index);
                for (Integer iii : temp) {
                    if (!visit[iii] && !nno.contains(iii)) {
                        qqq.add(iii);
                        visit[iii] = true;
                    }
                }

            }
            queue = qqq;
        }
        return res;
    }
}

public class LeetCode2368 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reachableNodes(7, new int[][]{{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}}, new int[]{4, 5}));
        System.out.println(solution.reachableNodes(7, new int[][]{{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}}, new int[]{4, 2, 1}));
    }
}
