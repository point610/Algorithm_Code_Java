package LeetCode.Middle.LeetCode792;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName LeetCode792
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 0:06
 * @Version 1.0
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) {
            return true;
        }
        int index = 0;
        int tsize = t.length();
        int ssize = s.length();
        if (ssize > tsize) {
            return false;
        }
        for (int i = 0; i < tsize; i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }

            if (index >= ssize) {
                return true;
            }
        }
        return false;

    }

    Map<String, Integer> integerMap = new HashMap<>();

    public int numMatchingSubseq(String s, String[] words) {
        AtomicInteger res = new AtomicInteger();
        int size = words.length;
        for (int i = 0; i < size; i++) {
            integerMap.put(words[i], integerMap.getOrDefault(words[i], 0) + 1);
        }
        integerMap.forEach((s1, integer) -> {
            if (isSubsequence(s1, s)) {
                res.addAndGet(integer);
            }
        });
        return res.get();
    }
}

public class LeetCode792 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numMatchingSubseq("dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }
}
