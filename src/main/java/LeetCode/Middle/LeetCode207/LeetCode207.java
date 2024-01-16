package LeetCode.Middle.LeetCode207;

import java.util.*;

/**
 * @ClassName LeetCode207
 * @Description TODO
 * @Author point
 * @Date 2023/11/15 22:51
 * @Version 1.0
 */
class Solution {
    int[] rudu;

    List<List<Integer>> list = new ArrayList<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        rudu = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        int size = prerequisites.length;
        for (int i = 0; i < size; i++) {
            int one = prerequisites[i][0];
            int two = prerequisites[i][1];

            list.get(two).add(one);
            rudu[one]++;

        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (rudu[i] == 0) {
                queue.add(i);
            }
        }

        int sum = 0;
        while (!queue.isEmpty()) {
            sum++;
            int current = queue.poll();
            List<Integer> templist = list.get(current);
            templist.forEach(integer -> {
                rudu[integer]--;
                if (rudu[integer] == 0) {
                    queue.add(integer);
                }
            });
        }
        return sum == numCourses;
    }
}

public class LeetCode207 {
}
