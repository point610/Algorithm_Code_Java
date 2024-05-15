package LeetCode.Middle.LeetCode752;

import java.util.*;

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000") || dead.contains(target)) {
            return -1;
        }

        if ("0000".equals(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("0000");

        Set<String> visit = new HashSet<>();
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                List<String> temp = getlist(current);

                for (String ss : temp) {
                    if (!visit.contains(ss) && !dead.contains(ss)) {
                        if (target.equals(ss)) {
                            return step;
                        }
                        queue.add(ss);
                        visit.add(ss);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> getlist(String current) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            char cc = current.charAt(i);
            char upper = (char) ((cc - '0' + 1) % 10 + '0');
            char lower = (char) ((cc - '0' - 1 + 10) % 10 + '0');

            String up = current.substring(0, i) + upper + current.substring(i + 1);
            list.add(up);

            String down = current.substring(0, i) + lower + current.substring(i + 1);
            list.add(down);
        }

        return list;
    }
}

public class LeetCode752 {
}
