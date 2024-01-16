package CodeTop.HW.HW791;

import java.util.*;

/**
 * @ClassName HW791
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 17:17
 * @Version 1.0
 */
class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        List<Character> has = new ArrayList<>();
        List<Character> no = new ArrayList<>();

        for (Character cc : s.toCharArray()) {
            if (map.containsKey(cc)) {
                has.add(cc);
            } else {
                no.add(cc);
            }
        }
        Collections.sort(has, Comparator.comparingInt(map::get));
        StringBuilder stringBuilder = new StringBuilder();
        for (Character cc : has) {
            stringBuilder.append(cc);
        }
        for (Character cc : no) {
            stringBuilder.append(cc);
        }

        return stringBuilder.toString();
    }
}

public class HW791 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.customSortString("cba", "abcd"));
        System.out.println(solution.customSortString("cbafg", "abcd"));
    }
}
