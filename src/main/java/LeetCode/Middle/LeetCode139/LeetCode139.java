package LeetCode.Middle.LeetCode139;

import java.util.List;

/**
 * @ClassName LeetCode139
 * @Description TODO
 * @Author point
 * @Date 2023/9/1 23:24
 * @Version 1.0
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] can = new boolean[size + 1];
        can[0] = true;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && wordDict.contains(s.substring(j, i))) {
                    can[i] = true;
                    break;
                }
            }
        }
        return can[size];

    }
}

public class LeetCode139 {
}
