package LeetCode.Easy.LCR120;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LCR120
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:32
 * @Version 1.0
 */
class Solution {
    public int findRepeatDocument(int[] documents) {
        Set<Integer> set = new HashSet<>();
        int size = documents.length;
        for (int i = 0; i < size; i++) {
            if (set.contains(documents[i])) {
                return documents[i];
            }
            set.add(documents[i]);
        }
        return 0;
    }
}

public class LCR120 {
}
