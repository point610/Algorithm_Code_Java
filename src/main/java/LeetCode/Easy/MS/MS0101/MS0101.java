package LeetCode.Easy.MS.MS0101;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MS01
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:34
 * @Version 1.0
 */
class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        int size = astr.length();
        for (int i = 0; i < size; i++) {
            if (set.contains(astr.charAt(i))) {
                return false;
            }
            set.add(astr.charAt(i));
        }
        return true;
    }
}

public class MS0101 {
}
