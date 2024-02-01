package CodeTop.HW.HW1129;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {

        int[][] rrr = new int[n][n];
        int[][] bbb = new int[n][n];

        for (int[] iii : redEdges) {
            int one = iii[0];
            int two = iii[1];
            rrr[one][two] = 1;
        }
        for (int[] iii : blueEdges) {
            int one = iii[0];
            int two = iii[1];
            bbb[one][two] = 1;
        }

        int[] lll = new int[n];
        Arrays.fill(lll, -1);
        lll[0] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        boolean[] visitr = new boolean[n];
        boolean[] visitb = new boolean[n];
        visitr[0] = true;
        int step = 0;
        while (!queue.isEmpty()) {
            // 红
            step++;
            Queue<Integer> qqqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int i = 0; i < n; i++) {
                    int temp = rrr[current][i];
                    if (temp == 1 && !visitr[i]) {
                        visitr[i] = true;

                        if (lll[i] == -1) {
                            lll[i] = step;
                        } else {
                            lll[i] = Math.min(lll[i], step);
                        }

                        qqqq.add(i);
                    }
                }
            }

            queue = qqqq;
            qqqq = new LinkedList<>();

            // 蓝
            step++;
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int i = 0; i < n; i++) {
                    int temp = bbb[current][i];
                    if (temp == 1 && !visitb[i]) {
                        visitb[i] = true;

                        if (lll[i] == -1) {
                            lll[i] = step;
                        } else {
                            lll[i] = Math.min(lll[i], step);
                        }

                        qqqq.add(i);
                    }
                }
            }
            queue = qqqq;
        }

        queue = new LinkedList<>();
        queue.add(0);
        visitr = new boolean[n];
        visitb = new boolean[n];
        visitb[0] = true;
        step = 0;
        while (!queue.isEmpty()) {
            // 红
            step++;
            Queue<Integer> qqqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int i = 0; i < n; i++) {
                    int temp = bbb[current][i];
                    if (temp == 1 && !visitb[i]) {
                        visitb[i] = true;

                        if (lll[i] == -1) {
                            lll[i] = step;
                        } else {
                            lll[i] = Math.min(lll[i], step);
                        }

                        qqqq.add(i);
                    }
                }
            }

            queue = qqqq;
            qqqq = new LinkedList<>();

            // 蓝
            step++;
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int i = 0; i < n; i++) {
                    int temp = rrr[current][i];
                    if (temp == 1 && !visitr[i]) {
                        visitr[i] = true;

                        if (lll[i] == -1) {
                            lll[i] = step;
                        } else {
                            lll[i] = Math.min(lll[i], step);
                        }

                        qqqq.add(i);
                    }
                }
            }
            queue = qqqq;
        }

        return lll;
    }
}

public class HW1129 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.shortestAlternatingPaths(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, new int[][]{{1, 2}, {2, 3}, {3, 1}})));
        System.out.println(Arrays.toString(solution.shortestAlternatingPaths(3, new int[][]{{0, 1}, {1, 2}}, new int[][]{})));
        System.out.println(Arrays.toString(solution.shortestAlternatingPaths(3, new int[][]{{0, 1}}, new int[][]{{2, 1}})));
    }
}
