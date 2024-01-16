package LeetCode.Easy.LeetCode944;

/**
 * @ClassName LeetCode944
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 22:32
 * @Version 1.0
 */
class Solution {
    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int column = strs[0].length();
        int res = 0;
        for (int i = 0; i < column; i++) {
            for (int j = 1; j < row; j++) {
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    res++;
                    break;
                }
            }
        }
        return res;

    }
}

public class LeetCode944 {
}
