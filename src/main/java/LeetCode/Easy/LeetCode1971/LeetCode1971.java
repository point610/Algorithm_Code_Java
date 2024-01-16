package LeetCode.Easy.LeetCode1971;

import java.util.*;

/**
 * @ClassName LeetCode1971
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 19:43
 * @Version 1.0
 */
class Solution {
    List<Integer>[] lists;

    boolean res = false;

    boolean[] visit;

    void DFS(int source, int destion) {
        if (source == destion) {
            res = true;
            return;
        }

        visit[source] = true;

        int size = lists[source].size();

        for (Integer next : lists[source]) {
            if (!visit[next]) {
                DFS(next, destion);
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        lists = new List[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new LinkedList<>();
        }

        int size = edges.length;
        for (int i = 0; i < size; i++) {
            lists[edges[i][0]].add(edges[i][1]);
            lists[edges[i][1]].add(edges[i][0]);
        }
        DFS(source, destination);
        return res;
    }
}

public class LeetCode1971 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPath(6, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
    }
}
