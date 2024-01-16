package CodeTop.HW.HW139;

import java.util.List;

/**
 * @ClassName HW139
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 19:26
 * @Version 1.0
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] list = new boolean[size + 1];
        list[0] = true;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                if (list[j] && wordDict.contains(s.substring(j, i))) {
                    list[i] = true;
                    break;
                }
            }
        }
        return list[size];
    }
}

public class HW139 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
