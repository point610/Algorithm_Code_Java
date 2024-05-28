package LeetCode.Middle.LeetCode841;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        boolean[] visit = new boolean[size];
        visit[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            Queue<Integer> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                int index = queue.poll();
                for (int i : rooms.get(index)) {
                    if (visit[i]) {

                    } else {
                        qqq.add(i);
                        visit[i] = true;
                    }
                }
            }
            queue = qqq;
        }

        for (int i = 0; i < size; i++) {
            if (!visit[i]) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode841 {
}
