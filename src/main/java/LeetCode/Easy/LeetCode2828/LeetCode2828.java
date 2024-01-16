package LeetCode.Easy.LeetCode2828;

import java.util.List;

/**
 * @ClassName LeetCode2828
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 22:57
 * @Version 1.0
 */
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int size = words.size();
        if (size != s.length()) {
            return false;
        }
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (words.get(i).charAt(0) != s.charAt(index++)) {
                return false;
            }

        }
        return true;
    }
}

public class LeetCode2828 {
}
