package LeetCode.Middle.LeetCode433;

import java.util.*;

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        if (startGene.equals(endGene)) {
            return 0;
        }
        Set<String> visit = new HashSet<>();
        Set<String> current = new HashSet<>();
        Collections.addAll(current, bank);
        if (!current.contains(endGene)) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(startGene);
        int step = 0;
        while (!queue.isEmpty()) {
            Queue<String> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                String temp = queue.poll();
                for (int i = 0; i < 8; i++) {
                    char tempcc = temp.charAt(i);
                    for (char c : "ACGT".toCharArray()) {
                        if (tempcc == c) {
                            continue;
                        }
                        StringBuilder sb = new StringBuilder(temp);
                        sb.setCharAt(i, c);
                        String s = sb.toString();
                        if (!visit.contains(s) && current.contains(s)) {
                            if (s.equals(endGene)) {
                                return step + 1;
                            }
                            visit.add(s);
                            qqq.add(s);
                        }
                    }
                }
            }
            queue = qqq;
            step++;
        }
        return -1;
    }
}

public class LeetCode433 {
}
