package LeetCode.Middle.LeetCode846;

import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));


        for (int num : hand) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                queue.add(num);
                map.put(num, 1);
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int value = map.get(cur);

            if (value == 0) {
                continue;
            }

            map.put(cur, 0);

            for (int i = 0; i < groupSize-1; i++) {

                if (!map.containsKey(cur + i + 1)) {
                    return false;
                }

                if (map.get(cur + i + 1) < value) {
                    return false;
                }

                map.put(cur + i + 1, map.get(cur + i + 1) - value);

            }

        }

        return true;
    }
}

public class LeetCode846 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        System.out.println(solution.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }
}
