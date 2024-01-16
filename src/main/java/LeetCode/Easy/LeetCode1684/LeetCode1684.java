package LeetCode.Easy.LeetCode1684;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1684
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:53
 * @Version 1.0
 */
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int size = allowed.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(allowed.charAt(i));
        }

        int res = 0;
        size = words.length;
        for (int i = 0; i < size; i++) {

            boolean has = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    has = false;
                    break;
                }
            }
            if (has) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode1684 {
}
