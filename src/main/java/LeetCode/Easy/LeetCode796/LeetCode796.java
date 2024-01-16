package LeetCode.Easy.LeetCode796;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode796
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 16:57
 * @Version 1.0
 */
class Solution {
    public boolean rotateString(String s, String goal) {
        int size = s.length();
        if (size != goal.length()) {
            return false;
        }
        char first = s.charAt(0);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (goal.charAt(i) == first) {
                list.add(i);
            }
        }

        // 开始检查
        size = list.size();
        for (int i = 0; i < size; i++) {
            StringBuilder stringBuilder = new StringBuilder(goal);

            // System.out.println(stringBuilder.substring(list.get(i)) + stringBuilder.substring(0, list.get(i)));

            if ((stringBuilder.substring(list.get(i)) + stringBuilder.substring(0, list.get(i))).equals(s)) {
                return true;
            }
        }
        return false;

    }
}

public class LeetCode796 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotateString("abcde", "cdeab");
    }
}
