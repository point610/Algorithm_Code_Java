package LeetCode.Easy.LeetCode1832;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1832
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:30
 * @Version 1.0
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        int size = sentence.length();
        for (int i = 0; i < size; i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}

public class LeetCode1832 {
}
