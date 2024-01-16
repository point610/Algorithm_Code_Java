package CodeTop.HW.HW210;

import java.util.*;

/**
 * @ClassName HW210
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 11:35
 * @Version 1.0
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> rudu = new HashMap<>();
        Map<Integer, Set<Integer>> xiaodamap = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            xiaodamap.put(i, new HashSet<>());
            rudu.put(i, 0);
        }

        for (int[] iii : prerequisites) {
            int xiao = iii[0];
            int da = iii[1];
            xiaodamap.get(xiao).add(da);
            rudu.put(xiao, rudu.getOrDefault(xiao, 0) + 1);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (Integer key : rudu.keySet()) {
            if (rudu.get(key) == 0) {
                queue.offer(key);
                list.add(key);
            }
        }

        while (!queue.isEmpty()) {
            Queue<Integer> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                Integer hao = queue.poll();
                for (Integer key : xiaodamap.keySet()) {
                    if (xiaodamap.get(key).contains(hao)) {
                        rudu.put(key, rudu.get(key) - 1);
                        if (rudu.get(key) == 0) {
                            temp.add(key);
                            list.add(key);
                        }
                    }

                }

            }
            queue = temp;
        }
        if (list.size()!=numCourses){
            return new int[0];
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class HW210 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findOrder(3, new int[][]{{1, 0}, {1, 2}, {0, 1}})));
        System.out.println(Arrays.toString(solution.findOrder(2, new int[][]{{1, 0}})));
        System.out.println(Arrays.toString(solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})));
        System.out.println(Arrays.toString(solution.findOrder(1, new int[][]{})));
    }
}
