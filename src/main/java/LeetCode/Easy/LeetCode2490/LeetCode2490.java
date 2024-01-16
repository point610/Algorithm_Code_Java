package LeetCode.Easy.LeetCode2490;

/**
 * @ClassName LeetCode2490
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:17
 * @Version 1.0
 */
class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] strings = sentence.split(" ");
        int size = strings.length;
        if (strings[0].charAt(0) != strings[size - 1].charAt(strings[size - 1].length() - 1)) {
            return false;
        }
        for (int i = 0; i < size - 1; i++) {
            if (strings[i + 1].charAt(0) != strings[i].charAt(strings[i].length() - 1)) {
                return false;
            }
        }
        return true;

    }
}

public class LeetCode2490 {
}
