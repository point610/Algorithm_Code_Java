package LeetCode.Easy.LeetCode2496;

/**
 * @ClassName LeetCode2496
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:30
 * @Version 1.0
 */
class Solution {
    boolean haszumu(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }

    public int maximumValue(String[] strs) {

        int max = 0;
        int size = strs.length;
        for (int i = 0; i < size; i++) {
            if (haszumu(strs[i])) {
                max = Math.max(max, strs[i].length());
            } else {
                max = Math.max(max, Integer.parseInt(strs[i]));
            }
        }
return max;
    }
}

public class LeetCode2496 {
}
