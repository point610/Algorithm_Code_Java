package LeetCode.Easy.MS.MS0102;

import java.util.Arrays;

/**
 * @ClassName MS0102
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:38
 * @Version 1.0
 */
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        for (int i = 0; i < size; i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }
        return true;
    }
}

public class MS0102 {
}
