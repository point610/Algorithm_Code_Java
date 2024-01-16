package CodeTop.HW.HW539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName HW539
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 21:02
 * @Version 1.0
 */
class Solution {
    private class Node {
        int hh;

        int mm;

        public Node(int hh, int mm) {
            this.hh = hh;
            this.mm = mm;
        }
    }

    public int findMinDifference(List<String> timePoints) {
        List<Node> list = new ArrayList<>();
        for (String ss : timePoints) {
            String[] split = ss.split(":");
            int hh = Integer.parseInt(split[0]);
            int mm = Integer.parseInt(split[1]);
            list.add(new Node(hh, mm));
            list.add(new Node(hh + 24, mm));

        }
        Collections.sort(list, (o1, o2) -> {
            if (o1.hh == o2.hh) {
                return o1.mm - o2.mm;
            }
            return o1.hh - o2.hh;
        });

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, Math.abs((list.get(i).hh - list.get(i - 1).hh) * 60 + (list.get(i).mm - list.get(i - 1).mm)));
        }

        return min;

    }
}

public class HW539 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");
        System.out.println(solution.findMinDifference(list));
    }
}
