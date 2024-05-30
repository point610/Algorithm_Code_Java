package LeetCode.Middle.LeetCode890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String one = get(pattern);
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (get(word).equals(one)) {
                list.add(word);
            }
        }

        return list;
    }

    private String get(String one) {
        Map<Character, Character> map = new HashMap<>();
        char aa = 'a';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            char cc = one.charAt(i);
            if (map.containsKey(cc)) {
            } else {
                aa++;
                map.put(cc, aa);
            }
            stringBuilder.append(map.get(cc));
        }
        return stringBuilder.toString();
    }
}

public class LeetCode890 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }
}
