package LeetCode.Middle.LeetCode447;

import java.util.HashMap;
import java.util.Map;

    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int size = points.length;
            int[][] list = new int[size][size];
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    int temp = getdis(points[i], points[j]);
                    list[i][j] = temp;
                    list[j][i] = temp;
                }
            }

            int res = 0;


            for (int i = 0; i < size; i++) {
                res += getnumber(list[i]);
            }

            return res;
        }

        private int getnumber(int[] one) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < one.length; i++) {
                map.put(one[i], map.getOrDefault(one[i], 0) + 1);
            }
            int res = 0;
            for (Integer key : map.keySet()) {
                res += cal(map.get(key));
            }
            return res;
        }

        private int cal(int one) {
            return one * (one - 1);
        }

        private int getdis(int[] one, int[] two) {
            return Math.abs(one[0] - two[0]) * Math.abs(one[0] - two[0]) + Math.abs(one[1] - two[1]) * Math.abs(one[1] - two[1]);
        }
    }

public class LeetCode447 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}}));
        System.out.println(solution.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        System.out.println(solution.numberOfBoomerangs(new int[][]{{1, 1}}));

    }
}
