package LeetCode.Easy.LeetCode17_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * @ClassName LeetCode17_15
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 20:49
 * @Version 1.0
 */
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words, ((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(o2.length(), o1.length());
            }
        }));

        Set<String> hashSet = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            hashSet.remove(word);
            if (find(hashSet, word)) {
                return word;
            }
        }
        return "";
    }

    private boolean find(Set<String> hashSet, String word) {
        if (word.length() == 0) {
            return true;
        }
        int size = word.length();
        for (int i = 0; i < size; i++) {
            if (hashSet.contains(word.substring(0, i + 1)) && find(hashSet, word.substring(i + 1))) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode17_15 {
}
