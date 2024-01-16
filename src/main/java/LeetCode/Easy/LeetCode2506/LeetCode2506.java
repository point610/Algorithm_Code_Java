package LeetCode.Easy.LeetCode2506;

import java.util.*;

/**
 * @ClassName LeetCode2506
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:39
 * @Version 1.0
 */
class Solution {
    String getchar(String s) {
        int size = s.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(s.charAt(i));
        }
        char[] chars = new char[set.size()];
        int index = 0;
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            chars[index++] = iterator.next();
        }
        Arrays.sort(chars);
        return new String(chars);
    }

    public int similarPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int size = words.length;
        for (int i = 0; i < size; i++) {
            String temp = getchar(words[i]);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        int sum = 0;
        for (String key : map.keySet()) {
            int number = map.get(key);
            sum += (number * (number - 1) / 2);

        }
        return sum;
    }
}

public class LeetCode2506 {
}
