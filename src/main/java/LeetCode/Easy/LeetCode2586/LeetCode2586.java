package LeetCode.Easy.LeetCode2586;

/**
 * @ClassName LeetCode2586
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 10:46
 * @Version 1.0
 */
class Solution {
    boolean isyuanyin(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int vowelStrings(String[] words, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (isyuanyin(words[i].charAt(0)) &&isyuanyin(words[i].charAt(words[i].length()-1))) {
                sum++;
            }
        }
        return sum;

    }
}

public class LeetCode2586 {
}
