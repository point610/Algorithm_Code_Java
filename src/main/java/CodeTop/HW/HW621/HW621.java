package CodeTop.HW.HW621;

import java.util.*;

class Solution {


    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char cc : tasks) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }
        List<Integer> lll = new ArrayList<>();
        for (Character key : map.keySet()) {
            lll.add(map.get(key));
        }
        lll.sort(Collections.reverseOrder());
        int count = 0;
        while (lll.get(0) != 0) {
            for (int i = 0; i <= n && lll.get(0) != 0; i++) {
                if (i >= lll.size() || lll.get(i) == 0) {
                    count++;
                    continue;
                }
                lll.set(i, lll.get(i) - 1);
            }
            lll.sort(Collections.reverseOrder());
        }
        //System.out.println(count);
        return count + tasks.length;
    }
}

public class HW621 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        System.out.println(solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
        System.out.println(solution.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2));
    }
}
