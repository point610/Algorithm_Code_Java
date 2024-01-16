package LeetCode.Easy.LeetCode2351;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2351
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:32
 * @Version 1.0
 */
class Solution {

    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return ' ';
    }
}


public class LeetCode2351 {
}
