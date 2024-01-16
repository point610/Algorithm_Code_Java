package LeetCode.Easy.LeetCode2103;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName LeetCode2103
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 17:56
 * @Version 1.0
 */
class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();

        int size = rings.length();
        for (int i = 1; i < size; i+=2) {

            char number = rings.charAt(i);
            char color = rings.charAt(i-1);

            if (map.containsKey(number)) {
                map.get(number).add(color);
            } else {
                Set<Character> set = new HashSet<>();
                set.add(color);
                map.put(number,set);
            }

        }
        int sum = 0;
        for (Character key : map.keySet()) {
            if (map.get(key).size() >= 3) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2103 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countPoints("G3R3R7B7R5B1G8G4B3G6");
    }
}
