package CodeTop.HW.HW763;

import java.util.*;

/**
 * @ClassName HW763
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 21:52
 * @Version 1.0
 */
class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> fff = new HashMap<>();
        Map<Character, Integer> lll = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!fff.containsKey(s.charAt(i))) {
                fff.put(s.charAt(i), i);
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (!lll.containsKey(s.charAt(i))) {
                lll.put(s.charAt(i), i);
            }
        }
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int maxright = 0;
        int maxleft = 0;
        while (maxright < size) {

            Queue<Character> queue = new LinkedList<>();
            queue.offer(s.charAt(maxleft));
            set.add(s.charAt(maxleft));
            while (!queue.isEmpty()) {
                char ccc = queue.poll();
                int left = fff.get(ccc);
                int right = lll.get(ccc);
                maxright = Math.max(right + 1, maxright);
                for (int i = left; i <= right; i++) {
                    if (!set.contains(s.charAt(i))) {
                        set.add(s.charAt(i));
                        queue.offer(s.charAt(i));
                    }
                }
            }
            list.add(maxright - maxleft);
            maxleft = maxright;
        }
        return list;
    }
}

public class HW763 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(solution.partitionLabels("eccbbbbdec"));
    }
}
