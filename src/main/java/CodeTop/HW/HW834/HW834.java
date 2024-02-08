package CodeTop.HW.HW834;

import java.util.*;

//class Solution {
//    public int[] sumOfDistancesInTree(int n, int[][] edges) {
//        if (edges == null || edges.length == 0 || n == 1) {
//            return new int[]{0};
//        }
//        boolean[][] lllll = new boolean[n][n];
//
//        for (int[] iii : edges) {
//            lllll[iii[0]][iii[1]] = true;
//            lllll[iii[1]][iii[0]] = true;
//        }
//
//        int[] res = new int[n];
//
//        boolean[] visit = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            int startindex = i;
//            visit = new boolean[n];
//            visit[startindex] = true;
//
//            int level = 0;
//            Queue<Integer> queue = new LinkedList<>();
//            queue.add(startindex);
//            while (!queue.isEmpty()) {
//                level++;
//                Queue<Integer> qqq = new LinkedList<>();
//                while (!queue.isEmpty()) {
//                    int tempindex = queue.poll();
//                    for (int j = 0; j < n; j++) {
//                        if (lllll[tempindex][j] && !visit[j]) {
//                            visit[j] = true;
//                            qqq.add(j);
//                        }
//                    }
//                }
//
//                // 计算距离
//                res[startindex] += qqq.size() * level;
//                queue = qqq;
//            }
//
//        }
//
//        return res;
//    }
//}

class Solution {
    int N = 30010, M = 60010, idx = 0, n;
    int[] he = new int[N], e = new int[M], ne = new int[M];
    int[] f = new int[N], c = new int[N], g = new int[N];

    void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx++;
    }

    public int[] sumOfDistancesInTree(int _n, int[][] es) {
        n = _n;
        Arrays.fill(he, -1);

        for (int[] e : es) {
            int a = e[0], b = e[1];
            add(a, b);
            add(b, a);
        }

        dfs1(0, -1);
        dfs2(0, -1);

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = f[i] + g[i];
        }
        return ans;
    }

    int[] dfs1(int u, int fa) {
        int tot = 0, cnt = 0;
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) {
                continue;
            }

            int[] next = dfs1(j, u);
            tot += next[0] + next[1] + 1;
            cnt += next[1] + 1;
        }
        f[u] = tot;
        c[u] = cnt;
        return new int[]{tot, cnt};
    }

    void dfs2(int u, int fa) {
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) {
                continue;
            }
            g[j] += g[u] + n - 1 - c[u]; // 往上再往上
            g[j] += f[u] - f[j] - c[j] + c[u] - 1 - c[j];  // 往上再往下
            dfs2(j, u);
        }
    }
}

public class HW834 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sumOfDistancesInTree(6, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}})));
        System.out.println(Arrays.toString(solution.sumOfDistancesInTree(1, new int[][]{})));
        System.out.println(Arrays.toString(solution.sumOfDistancesInTree(2, new int[][]{{1, 0}})));
    }
}
