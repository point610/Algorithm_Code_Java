package CodeTop.HW.HW207;

import java.util.*;

/**
 * @ClassName HW207
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 19:57
 * @Version 1.0
 */
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        Map<Integer, List<Integer>> listMap = new HashMap<>();
        Map<Integer, Integer> rudu = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            listMap.put(i, new ArrayList<>());
            rudu.put(i, 0);
        }
        for (int[] iii : prerequisites) {
            int da = iii[1];
            int xiao = iii[0];
            listMap.get(xiao).add(da);
            rudu.put(xiao, rudu.get(xiao) + 1);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (Integer key : listMap.keySet()) {
            if (listMap.get(key).size() == 0) {
                queue.offer(key);
            }
        }

        while (!queue.isEmpty()) {
            int index = queue.poll();
            for (Integer key : listMap.keySet()) {
                if (listMap.get(key).contains(index) && rudu.get(key) > 0) {
                    rudu.put(key, rudu.get(key) - 1);
                    if (rudu.get(key) == 0) {
                        queue.offer(key);
                    }
                }
            }
        }
        for (Integer ii : rudu.keySet()) {
            if (rudu.get(ii) != 0) {
                return false;
            }
        }
        return true;
    }
}

public class HW207 {
    public static void main(String[] args) {
        System.out.println(new Solution().canFinish(1, new int[][]{}));
        System.out.println(new Solution().canFinish(2, new int[][]{{1, 0}}));
        System.out.println(new Solution().canFinish(2, new int[][]{{1, 0}, {0, 1}}));
        int[][] course = new int[][]{{3, 0}, {3, 1}, {4, 1}, {4, 2}, {5, 3}, {5, 4}};
        System.out.println(new Solution().canFinish(6, course));
    }
}
