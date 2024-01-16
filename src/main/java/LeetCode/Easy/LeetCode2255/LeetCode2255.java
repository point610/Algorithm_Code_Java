package LeetCode.Easy.LeetCode2255;

/**
 * @ClassName LeetCode2255
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 17:51
 * @Version 1.0
 */
class Solution {

    public int countPrefixes(String[] words, String s) {
        int sum = 0;
        int size = words.length;
        for (int i = 0; i < size; i++) {
            if (s.indexOf(words[i]) == 0) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2255 {
}
