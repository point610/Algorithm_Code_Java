package LeetCode.Easy.LeetCode290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName LeetCode290
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 21:13
 * @Version 1.0
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strings = s.split(" ");
        int size = strings.length;
        if (size != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(strings[i])) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        Set<String> set = new HashSet<>();
        for (Character key : map.keySet()) {
            if (set.contains(map.get(key))) {
                return false;
            } else {
                set.add(map.get(key));
            }
        }
        return true;
    }
}

public class LeetCode290 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("ab", "happy hacking"));
    }
}
