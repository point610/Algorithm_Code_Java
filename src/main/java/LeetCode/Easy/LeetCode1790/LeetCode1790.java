package LeetCode.Easy.LeetCode1790;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1790
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:45
 * @Version 1.0
 */
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int size = s1.length();
        int difftimes = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                difftimes++;
                list.add(i);
            }
        }
        if (difftimes == 0) {
            return true;
        }
        if (difftimes != 2) {
            return false;
        }

        return s1.charAt(list.get(0)) == s2.charAt(list.get(1)) && s1.charAt(list.get(1)) == s2.charAt(list.get(0));

    }
}

public class LeetCode1790 {
}
